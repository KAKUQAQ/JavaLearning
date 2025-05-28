package Team.service;

import Team.domain.Architect;
import Team.domain.Designer;
import Team.domain.Employee;
import Team.domain.Programmer;

public class TeamService {
    private static  int counter = 1;

    private final int MAX_MEMBERS = 5;

    private Programmer[] team = new Programmer[MAX_MEMBERS];

    private int total;

    public Programmer[] getTeam() {
        Programmer[] temp = new Programmer[total];
        for (int i = 0; i < total; i++) {
            temp[i] = team[i];
        }
        return temp;
    }
    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBERS) {
            throw new TeamException("成员已满");
        }
        if(!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员");
        }

        Programmer p = (Programmer) e;
        Status s = p.getStatus();
        switch (s) {
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员工正在休假");
        }

        boolean isExist = isExist(p);
        if (isExist) {
            throw new TeamException("该员工已在团队中");
        }

        int progNum, desNum, arcNum;
        progNum = desNum = arcNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                arcNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            }else {
                progNum++;
            }
        }
        if(p instanceof Architect) {
            if (arcNum >= 1) {
                throw new TeamException("最多一名架构师");
            }
        }else if(p instanceof Designer) {
            if (desNum >= 2) {
                throw new TeamException("最多两名设计师");
            }
        }else {
            if (progNum >= 3) {
                throw new TeamException("最多三名程序员");
            }
        }
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
    }

    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);

                break;
            }
        }
        if (i == total) {
            throw new TeamException("未找到该MumberID");
        }

        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;
    }
}

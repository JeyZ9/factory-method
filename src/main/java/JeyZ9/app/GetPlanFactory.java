package JeyZ9.app;

public class GetPlanFactory {
    public Plan getPlan(String planType) {
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DP")){
            return new DomesiticPlan();
        }else if(planType.equalsIgnoreCase("CP")){
            return new CommercialPlan();
        }else if(planType.equalsIgnoreCase("IP")){
            return new InstitutionalPlan();
        }else if(planType.equalsIgnoreCase("SP")){
            return new StudentPlan();
        }
        return null;
    }
}

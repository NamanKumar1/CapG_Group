    public class EducationalEndowment extends Endowment{

        private String educationalInstitution,educationalDivision;
        public EducationalEndowment(String endowmentId, String holderName, String endowmentType, String registratiomDate,String educationalInstitution,String educationalDivision) {
            super(endowmentId, holderName, endowmentType, registratiomDate);
            this.educationalInstitution=educationalInstitution;
            this.educationalDivision=educationalDivision;
        }

        public String getEducationalInstitution() {
            return educationalInstitution;
        }

        public void setEducationalInstitution(String educationalInstitution) {
            this.educationalInstitution = educationalInstitution;
        }

        public String getEducationalDivision() {
            return educationalDivision;
        }

        public void setEducationalDivision(String educationalDivision) {
            this.educationalDivision = educationalDivision;
        }

        public double calculateEndowment(){
            educationalDivision=educationalDivision.toUpperCase();
            if(educationalDivision.equals("SCHOOL")){
                return 30000;

            } else if (educationalDivision.equals("UNDERGRADUATE"))
            {
                return 6000;
            } else if(educationalDivision.equals("POSTGRADUATE"))
            {
                return 90000;
            }
            else{
                return 0;
            }
        }
    }


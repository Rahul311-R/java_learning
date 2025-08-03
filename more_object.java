public class more_object {

        int Batch;
        String course;

      public more_object(int batch, String course){
            this.Batch=batch;
            this.course=course;
        }
        void displayinfo(){
            System.out.println("batch:"+Batch+" course:"+course);
        }

        public static void main(String[] args) {
            more_object my = new more_object(2313,"ai");
            my.displayinfo();
        }

    }


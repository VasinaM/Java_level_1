package Animal;

abstract class Animal {
    private  int run;
    private  int swim;
    private  float jump;

    public Animal(int run, int swim, float jump){
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public Animal() {

    }

    abstract void run(int length);
    abstract void swim(int length);
    abstract void jump(float height);

    abstract void run_limit(int length);

    abstract void jump_limit(float height);

    abstract void swim_limit(int length);
}

 class Dog extends Animal {


     public Dog(int run_limit, int swim_limit, float jump_limit) {

         super(run_limit, swim_limit, jump_limit);
     }

     @Override
     void run(int length) {

     }
     @Override
     void swim(int length) {

     }
     @Override
     void jump(float height) {

     }
     private int run = 500;
     private  float jump = 0.5f;
     private  int swim = 10;
     @Override
     void run_limit(int length){
         if((length >= 0) && (length <= run)){
             System.out.println("run: true");
         } else {
             System.out.println("run: false");
         }
     }
     @Override
     void jump_limit(float height){
         if((height >= 0) && (height <= jump)){
             System.out.println("jump: true");
         } else {
             System.out.println("jump: false");
         }
     }
     @Override
     void swim_limit(int length){
         if ((length >= 0) && (length <= swim)) {
             System.out.println("swim: true");
         } else {
             System.out.println("swim: false");
         }
     }

}


class Cat extends  Animal {


    public Cat(int run, int swim, float jump) {
        super(run, swim, jump);
    }

    @Override
    void run(int length) {

    }

    @Override
    void swim(int length) {

    }

    @Override
    void jump(float height) {

    }

    private int run = 200;
    private  float jump = 2f;
        @Override
        void run_limit(int length){
            if((length >= 0) && (length <= run)){
                System.out.println("run: true");
            } else {
                System.out.println("run: false");
        }
        }
        @Override
        void jump_limit(float height){
                if((height >= 0) && (height <= jump)){
                    System.out.println("jump: true");
                } else {
                    System.out.println("jump: false");
                }
            }
        @Override
        void swim_limit(int length){
            System.out.println("swim: false");
        }
}









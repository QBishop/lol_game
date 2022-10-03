public class lol {
    public static void main(String[] args) {



   Champ ch1 = new Champ("미스포츈",640,325,550,52);
    Champ ch2 = new Champ("야스오",590,345,175,60);
    ch1.info();
    ch2.info();
    ch1.spawn(1000);
    ch2.spawn(400);
    ch1.back_move();
    ch1.attack(ch2);
    ch2.attack(ch1);


    }
}


class Champ{
    String name;
    int hp;
    int speed;
    int range;
    int location;
    static int count=0;
    int power;

    Champ(String name, int hp, int speed, int range,int power){
        count++;
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.range = range;
        this.power = power;
    }
    void info() {System.out.printf("이름:%s 체력:%d,이동속도:%d,사거리:%d,공격력:%d\n",name,hp,speed,range,power,location);}//divide 라는 결과값을 출력해주려고할때 사용법? 지금은 void로 다 만들었다.
    void move(){location+=speed;System.out.printf("%s 앞으로 이동,위치:%d\n",name,location);}
    void back_move(){location-=speed;System.out.printf("%s 뒤로이동,위치:%d\n",name,location);}
    void attack(Champ enermy){
        if(location+range<enermy.location) {
            System.out.printf("거리가 안돼 공격할 수 없습니다.\n");
        }else if(location-range> enermy.location){
            System.out.printf("거리가 안돼 공격할 수 없습니다.\n");
        }else {
        enermy.hp-= power;
        System.out.printf("%s 공격!%s체력이 %d입니다.\n",name,enermy.name,enermy.hp);}
    }
    void spawn(int A){
        location+=A;
        System.out.printf("%s 위치:%d\n",name, A);
    }





}



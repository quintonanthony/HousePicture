import java.awt.*;

public class Picture
{
    private Square ground;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square sky;
    private Person bill;
    private Square windowTwo;
    private Rectangle door;
    private Circle attic;
    private Person jimmy;
    private Square cloud;
    private Circle circ;
    private Circle oval;
    private Circle finale;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        sky = new Square();
        ground = new Square();
        bill = new Person();
        door = new Rectangle();
        windowTwo = new Square();
        attic = new Circle();
        jimmy = new Person();
        cloud = new Square();
        circ = new Circle();
        oval = new Circle();
        finale = new Circle();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("skyBlue");
            sky.moveHorizontal(-350);
            sky.moveVertical(-150);
            sky.changeSize(100000);
            sky.makeVisible();

            ground.changeColor("green");
            ground.moveHorizontal(-340);
            ground.moveVertical(140);
            ground.changeSize(100000);
            ground.makeVisible();

            wall.changeColor("aBlue");
            wall.moveHorizontal(-30);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();

            bill.changeColor("lavendar");
            bill.moveHorizontal(-20);
            bill.moveVertical(30);
            bill.makeVisible();

            jimmy.changeColor("lavendar");
            jimmy.moveHorizontal(-50);
            jimmy.moveVertical(30);
            jimmy.makeVisible();

            window.changeColor("white");
            window.moveHorizontal(-10);
            window.moveVertical(40);
            window.changeSize(30);
            window.makeVisible();

            windowTwo.changeColor("white");
            windowTwo.moveHorizontal(40);
            windowTwo.moveVertical(40);
            windowTwo.changeSize(30);
            windowTwo.makeVisible();

            roof.changeColor("brown");
            roof.changeSize(60, 180);
            roof.moveHorizontal(130);
            roof.moveVertical(-50);
            roof.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(-60);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();

            cloud.changeColor("white");
            cloud.moveHorizontal(-250);
            cloud.moveVertical(-70);
            cloud.changeSize(40);
            cloud.makeVisible();

            circ.changeColor("white");
            circ.moveHorizontal(-200);
            circ.moveVertical(-40);
            circ.changeSize(50);
            circ.makeVisible();

            oval.changeColor("white");
            oval.moveHorizontal(-170);
            oval.moveVertical(-50);
            oval.changeSize(50);
            oval.makeVisible();

            finale.changeColor("white");
            finale.moveHorizontal(-170);
            finale.moveVertical(-30);
            finale.changeSize(50);
            finale.makeVisible();

            attic.changeColor("white");
            attic.moveHorizontal(90);
            attic.moveVertical(20);
            attic.changeSize(30);
            attic.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}

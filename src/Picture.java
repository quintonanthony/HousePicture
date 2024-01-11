public class Picture
{
    private Square ground;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square sky;

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

            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(100);
            wall.makeVisible();



            wall.changeColor("aBlue");
            wall.moveHorizontal(-30);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();

          /*  window.changeColor("black");
            window.moveHorizontal(-10);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
        */
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-50);
            roof.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
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

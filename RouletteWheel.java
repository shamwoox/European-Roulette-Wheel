class RouletteWheel
{
    int number;//Fields
    
    RouletteWheel()
    {
        number = 0;
    }
    //Sets the number
    void setNumber(int numberIn)
    {
        number = numberIn;
    }
    //Determines the color
    String getColor()
    {
        if (number == 0)
        {
            return "green";
        }
        else if (number >= 29)
        {
            if (number % 2 == 0)
            {
                return "Red";
            }
            else
            {
                return "Black";
            }
        }
        else if (number >= 19)
        {
            if (number % 2 == 0)
            {
                return "Black";
            }
            else
            {
                return "Red";
            }
        }
        else if (number >= 11)
        {
            if (number % 2 == 0)
            {
                return "Red";
            }
            else
            {
                return "Black";
            }
        }
        else
        {
            if (number % 2 == 0)
            {
                return "Black";
            }
            else
            {
                return "Red";
            }
        }
    }
}
   
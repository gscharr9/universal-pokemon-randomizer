package com.dabomstew.pkrandom.pokemon;

import java.util.HashSet;
import java.util.Random;

public class Palette {

    public static final byte NORMAL_BASE_RED = 21;
    public static final byte NORMAL_BASE_GREEN = 21;
    public static final byte NORMAL_BASE_BLUE = 15;
    
    public static final byte FIGHTING_BASE_RED = 24;
    public static final byte FIGHTING_BASE_GREEN = 6;
    public static final byte FIGHTING_BASE_BLUE = 5;
    
    public static final byte FLYING_BASE_RED = 21;
    public static final byte FLYING_BASE_GREEN = 18;
    public static final byte FLYING_BASE_BLUE = 30;
    
    public static final byte GRASS_BASE_RED = 15;
    public static final byte GRASS_BASE_GREEN = 25;
    public static final byte GRASS_BASE_BLUE = 10;

    public static final byte WATER_BASE_RED = 13;
    public static final byte WATER_BASE_GREEN = 18;
    public static final byte WATER_BASE_BLUE = 30;

    public static final byte FIRE_BASE_RED = 30;
    public static final byte FIRE_BASE_GREEN = 16;
    public static final byte FIRE_BASE_BLUE = 6;

    public static final byte ROCK_BASE_RED = 23;
    public static final byte ROCK_BASE_GREEN = 20;
    public static final byte ROCK_BASE_BLUE = 7;

    public static final byte GROUND_BASE_RED = 23;
    public static final byte GROUND_BASE_GREEN = 20;
    public static final byte GROUND_BASE_BLUE = 7;

    public static final byte PSYCHIC_BASE_RED = 31;
    public static final byte PSYCHIC_BASE_GREEN = 11;
    public static final byte PSYCHIC_BASE_BLUE = 17;

    public static final byte BUG_BASE_RED = 21;
    public static final byte BUG_BASE_GREEN = 23;
    public static final byte BUG_BASE_BLUE = 4;

    public static final byte DRAGON_BASE_RED = 21;
    public static final byte DRAGON_BASE_GREEN = 23;
    public static final byte DRAGON_BASE_BLUE = 4;

    public static final byte ELECTRIC_BASE_RED = 31;
    public static final byte ELECTRIC_BASE_GREEN = 26;
    public static final byte ELECTRIC_BASE_BLUE = 6;

    public static final byte GHOST_BASE_RED = 14;
    public static final byte GHOST_BASE_GREEN = 11;
    public static final byte GHOST_BASE_BLUE = 19;

    public static final byte POISON_BASE_RED = 20;
    public static final byte POISON_BASE_GREEN = 8;
    public static final byte POISON_BASE_BLUE = 20;

    public static final byte ICE_BASE_RED = 19;
    public static final byte ICE_BASE_GREEN = 27;
    public static final byte ICE_BASE_BLUE = 27;

    public static final byte STEEL_BASE_RED = 23;
    public static final byte STEEL_BASE_GREEN = 23;
    public static final byte STEEL_BASE_BLUE = 26;

    public static final byte DARK_BASE_RED = 14;
    public static final byte DARK_BASE_GREEN = 11;
    public static final byte DARK_BASE_BLUE = 9;

    private byte red;
    private byte green;
    private byte blue;

    public Palette(int color)
    {
        red = (byte) (color & 0x1F);
        green = (byte) ((color >> 5) & 0x1F);
        blue = (byte) ((color >> 10) & 0x1F);
    }
    
    public Palette(Palette p)
    {
        this.red = p.red;
        this.green = p.green;
        this.blue = p.blue;
    }
    
    public Palette(Random random)
    {
        this(null, random);
    }

    public Palette(Type t, Random random)
    {
        //if no RNG is provided, go grey.
        if (random == null)
        {
            red = 15;
            green = 15;
            blue = 15;
        }
        //5% chance of totally random palette
        else if (((byte) random.nextInt(20) == 0) || (t == null))
        {
            red = (byte) random.nextInt(32);
            blue = (byte) random.nextInt(32);
            green = (byte) random.nextInt(32);
        }
        else
        {
            switch (t)
            {
            case NORMAL:
                red = NORMAL_BASE_RED;
                green = NORMAL_BASE_GREEN;
                blue = NORMAL_BASE_BLUE;
                break;
            case FIGHTING:
                red = FIGHTING_BASE_RED;
                green = FIGHTING_BASE_GREEN;
                blue = FIGHTING_BASE_BLUE;
                break;
            case FLYING:
                red = FLYING_BASE_RED;
                green = FLYING_BASE_GREEN;
                blue = FLYING_BASE_BLUE;
                break;
            case GRASS:
                red = GRASS_BASE_RED;
                green = GRASS_BASE_GREEN;
                blue = GRASS_BASE_BLUE;
                break;
            case WATER:
                red = WATER_BASE_RED;
                green = WATER_BASE_GREEN;
                blue = WATER_BASE_BLUE;
                break;
            case FIRE:
                red = FIRE_BASE_RED;
                green = FIRE_BASE_GREEN;
                blue = FIRE_BASE_BLUE;
                break;
            case ROCK:
                red = ROCK_BASE_RED;
                green = ROCK_BASE_GREEN;
                blue = ROCK_BASE_BLUE;
                break;
            case GROUND:
                red = GROUND_BASE_RED;
                green = GROUND_BASE_GREEN;
                blue = GROUND_BASE_BLUE;
                break;
            case PSYCHIC:
                red = PSYCHIC_BASE_RED;
                green = PSYCHIC_BASE_GREEN;
                blue = PSYCHIC_BASE_BLUE;
                break;
            case BUG:
                red = BUG_BASE_RED;
                green = BUG_BASE_GREEN;
                blue = BUG_BASE_BLUE;
                break;
            case DRAGON:
                red = DRAGON_BASE_RED;
                green = DRAGON_BASE_GREEN;
                blue = DRAGON_BASE_BLUE;
                break;
            case ELECTRIC:
                red = ELECTRIC_BASE_RED;
                green = ELECTRIC_BASE_GREEN;
                blue = ELECTRIC_BASE_BLUE;
                break;
            case DARK:
                red = DARK_BASE_RED;
                green = DARK_BASE_GREEN;
                blue = DARK_BASE_BLUE;
                break;
            case POISON:
                red = POISON_BASE_RED;
                green = POISON_BASE_GREEN;
                blue = POISON_BASE_BLUE;
                break;
            case ICE:
                red = ICE_BASE_RED;
                green = ICE_BASE_GREEN;
                blue = ICE_BASE_BLUE;
                break;
            case STEEL:
                red = STEEL_BASE_RED;
                green = STEEL_BASE_GREEN;
                blue = STEEL_BASE_BLUE;
                break;
            case GHOST:
                red = GHOST_BASE_RED;
                green = GHOST_BASE_GREEN;
                blue = GHOST_BASE_BLUE;
                break;
            default:
                red = (byte) random.nextInt(32);
                blue = (byte) random.nextInt(32);
                green = (byte) random.nextInt(32);
                break;
            }
            byte variance = 4;
            if (red < variance)
            {
                variance = red;
            }
            if (31 - red < variance)
            {
                variance = (byte) ((byte) 31 - red);
            }
    
            red += (byte) random.nextInt((2 * variance) + 1) - variance;
            
            if (green < variance)
            {
                variance = green;
            }
            if (31 - green < variance)
            {
                variance = (byte) ((byte) 31 - green);
            }
            
            green += (byte) random.nextInt((2 * variance) + 1) - variance;
            
            if (blue < variance)
            {
                variance = blue;
            }
            if (31 - blue < variance)
            {
                variance = (byte) ((byte) 31 - blue);
            }
            
            blue += (byte) random.nextInt((2 * variance) + 1) - variance;
        }
    }
    
    public void darken()
    {
        scale(.7);
    }
    
    public void brighten()
    {
        scale(1.3);
    }
    
    public void scale(double factor)
    {
        red = (byte)(factor * (double) red);
        blue = (byte)(factor * (double) blue);
        green = (byte)(factor * (double) green);
        normalize();
    }
    
    private void normalize()
    {
        if (red < 0)
        {
            red = 0;
        }
        else if (red > 31)
        {
            red = 31;
        }
        if (blue < 0)
        {
            blue = 0;
        }
        else if (blue > 31)
        {
            blue = 31;
        }
        if (green < 0)
        {
            green = 0;
        }
        else if (green > 31)
        {
            green = 31;
        }
    }

    public byte getRed()
    {
        return red;
    }
    public byte getGreen()
    {
        return green;
    }
    public byte getBlue()
    {
        return blue;
    }
    
    public int composeColor()
    {
        int result = (red & 0x1F) | ((green & 0x1F) << 5) | ((blue & 0x1F) << 10);
        return result;
    }
    
    double getMagnitude()
    {
        double result = (double)((int) red) * ((int) red);
        result += (double)((int) blue) * ((int) blue);
        result += (double)((int) green) * ((int) green);
        return Math.sqrt(result);
    }
    
    public static void randomPalettes(Pokemon p, Random random, HashSet<String> singlePalette)
    {
        int primary_choice;
        
        if (random == null)
        {
            primary_choice = 99;
        }else
        {
            primary_choice = random.nextInt(100);
        }
        
        if (primary_choice < 5)
        {
            p.palette1 = new Palette(null, random);
        }
        else if ((p.secondaryType != null) && (primary_choice < 45))
        {
            p.palette1 = new Palette(p.secondaryType, random);
            if ((singlePalette.contains(p.name)) || (primary_choice < 37))
            {
                p.palette2 = new Palette(p.palette1);
            }
            else if (primary_choice < 41)
            {
                p.palette2 = new Palette(p.primaryType, random);
            }
            else
            {
                p.palette2 = new Palette(null, random);
            }
        }
        else
        {
            p.palette1 = new Palette(p.primaryType, random);
            if ((singlePalette.contains(p.name))|| (primary_choice < 90))
            {
                p.palette2 = new Palette(p.palette1);
            }
            else if (primary_choice < 95)
            {
                p.palette2 = new Palette(p.secondaryType, random);
            }
            else
            {
                p.palette2 = new Palette(null, random);
            }
        }
        Palette.relativeShade(p.palette1, p.palette2, random);
    }
    
    public static void relativeShade(Palette p1, Palette p2, Random random)
    {
        while ((p1.getMagnitude() - p2.getMagnitude()) < 4.0)
        {
            //If palette 1 is already bright, darken palette 2
            if (p1.getMagnitude() > 23.8)
            {
                p2.darken();
            }
            else if (p2.getMagnitude() < 7.2)//If palette 2 is already dark, brighten palette 1
            {
                p1.brighten();
            }
            else //Otherwise, either can shift shade, but prefer to preserve the pre-evo's palette 1
            {
                if (random.nextDouble() < 0.7)
                {
                    p2.darken();
                }
                else
                {
                    p1.brighten();
                }
            }
        }
    }
}

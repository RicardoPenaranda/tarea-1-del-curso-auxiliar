

public class animales
{
    private String nombre;
    private String habitad;
    private int tiempodevida;
    private int numerodepatas;
    
    public animales()
    {   
    }
    
    public void setNombre(String nombre)
    {
       this.nombre = nombre;  
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
        public void setHabitad(String habitad)
    {
       this.habitad = habitad;  
    }
    public String getHabitad()
    {
        return this.habitad;
    }
    
    public void setTiempodevida(int tiempodevida)
    {
       this.tiempodevida = tiempodevida;  
    }
    public int getTiempodevida()
    {
        return this.tiempodevida;
    }    
        
    public void setNumerodepatas(int numerodepatas)
    {
       this.numerodepatas = numerodepatas;  
    }
    public int getnumerodepatas()
    {
        return this.numerodepatas;
    }    
    

     public String DeterminarTipoAnimal(int numerodepatas)
    {
        String tipoanimal = "";
        if(numerodepatas == 4)
        {
            tipoanimal = "cuadrupedo";
        }
        else if(numerodepatas == 2)
        {
            tipoanimal = "bipedo";
        }
        else if(numerodepatas == 0)
        {
            tipoanimal = "rastrero";
        }
        else
        {
            tipoanimal = "no definido";
        }
        return tipoanimal; 
    }
    
    
}

    
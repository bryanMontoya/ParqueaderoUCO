package co.com.k4soft.parqueaderouco.entidades;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import co.com.k4soft.parqueaderouco.persistencia.Tabla;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(tableName = Tabla.TARIFA)
@NoArgsConstructor
public class Tarifa {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "idTarifa")
    private Integer idTarifa;
    @ColumnInfo(name = "nombre")
    private String nombre;
    @ColumnInfo(name = "precio")
    private double precio;

    @NonNull
    public Integer getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(@NonNull Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

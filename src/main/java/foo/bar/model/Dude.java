package foo.bar.model;


import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Dude {
	private String nome;
	private int numero;
}

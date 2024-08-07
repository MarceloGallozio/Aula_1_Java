package br.com.arq.model;

public class Person {
//ctrl + shift + o (importação)
//ctrl + shift + f (alinhamento)
	private Long codePerson;
	private String name;
	private String email;

	public Long getCodePerson() {
		return codePerson;
	}

	public void setCodePerson(Long codePerson) {
		this.codePerson = codePerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.setCodePerson(100L);
		person.setName("Marcelo");
		person.setEmail("marcelo@estacio.br");

		System.out.println(person.getName() + ", " + person.getEmail());
	}
}

package com.example;

public class Teacher {
			private String tName;
			private String tNickname;
			public Teacher(String tName, String tNickname) {
				super();
				this.tName = tName;
				this.tNickname = tNickname;
			}
			public String gettName() {
				return tName;
			}
			public void settName(String tName) {
				this.tName = tName;
			}
			public String gettNickname() {
				return tNickname;
			}
			public void settNickname(String tNickname) {
				this.tNickname = tNickname;
			}
			
			
}

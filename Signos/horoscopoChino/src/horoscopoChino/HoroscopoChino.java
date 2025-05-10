package horoscopoChino;

import javax.swing.JOptionPane;

class HoroscopoChino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anio;
		String  mensaje;
		
		
		anio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: "));
		
		if (anio==1924 || anio==1936 || anio== 1948 || anio==1960 || anio==1972 || anio==1984 || anio==1996 || anio== 2008 || anio== 2020) {
			mensaje="Rata";
			
		} else if(anio==1925 || anio==1937 || anio==1949 || anio==1961 || anio==1973 || anio==1985 || anio==1997 || anio==2009 || anio==2021) {
			mensaje="Buey";
		}else if(anio==1926 || anio==1938 || anio==1950 || anio==1962 || anio==1974 || anio ==1986 || anio== 1998 || anio== 2010 || anio==2022) {
			mensaje="Tigre";
		}else if(anio==1927 || anio == 1939 || anio==1951 || anio==1963 || anio==1975 || anio==1987 || anio == 1999 || anio==2011 || anio==2023) {
			mensaje="Conejo";
	}
	else if(anio==1928 || anio==1940 || anio==1952 || anio==1964 || anio==1976 || anio==1988 || anio==2000 || anio== 2012 || anio==2024) {
		mensaje="Dragón";
	}
	else if(anio==1929 || anio==1941 || anio== 1953 || anio==1965 || anio ==1977 || anio==1989 || anio==2001 || anio==2013 || anio==2025) {
		mensaje="Serpiente";
	}
	else if(anio==1930 || anio==1942 || anio==1954 || anio==1966 || anio== 1978 || anio==1990 || anio==2002 || anio== 2014) {
		mensaje="Caballo";
	}
	else if(anio==1931 || anio==1943 || anio==1955 || anio==1967 || anio==1979 || anio==1991 || anio==2003 || anio==2015 ) {
		mensaje="Cabra";
	}
	else if(anio==1932 || anio== 1944 || anio== 1956 || anio==1968 || anio==1980 || anio==1992 || anio==2004 || anio==2016) {
		mensaje="Mono";
	}
	else if(anio==1933 || anio==1945 || anio ==1957 || anio==1969 || anio== 1981 || anio==1993 || anio==2005 || anio==2017) {
		mensaje="Gallo";
	}
	else if(anio==1934 || anio==1946 || anio== 1958 || anio== 1970 || anio== 1982 || anio == 1994 || anio==2006 || anio==2018) {
		mensaje="Perro";
	}
	else if(anio==1935 || anio==1947 || anio==1959 || anio==1971 || anio== 1983 || anio== 1995 || anio==2007 || anio==2019) {
		mensaje="Cerdo";
	}else {
		mensaje="Año invalido";
		}
		
		JOptionPane.showMessageDialog(null, "Tu signo del horoscopo chino es: " + mensaje);
		}
	
}

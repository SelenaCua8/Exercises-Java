package signos;

import javax.swing.JOptionPane;

class Signos {

	public static void main(String[] args) {

		String mes, mensaje = null;
		int dia;
		
		mes = JOptionPane.showInputDialog("Ingrese mes de nacimiento: ");
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia de nacimiento: "));

		if (mes.equalsIgnoreCase("enero")) {
			if (dia >= 1 && dia <= 20) {
				mensaje = "Tu signo es capricornio";

			} else {
				if (dia >= 21 && dia <= 31) {
					mensaje = "Tu signo es acuario";

				} else {
					mensaje = "Error de tipeo";

				}

			}

		} else if (mes.equalsIgnoreCase("febrero")) {
			if (dia >= 1 && dia <= 18) {
				mensaje = "Tu signo es acuario";

			} else {
				mensaje = "Tu signo es Piscis";

			}

		} else {
			if (mes.equalsIgnoreCase("marzo")) {
				if (dia >= 1 && dia <= 20) {
					mensaje = "Tu signo es Piscis";

				} else {
					if (dia >= 21 && dia <= 31) {
						mensaje = "Tu signo es aries";

					} else {
						mensaje = "Error de ingreso de datos";

					}

				}

			} else {
				if (mes.equalsIgnoreCase("abril")) {
					if (dia >= 1 && dia <= 20) {
						mensaje = "Tu signo esAries";

					} else {
						if (dia >= 21 && dia <= 30) {
							mensaje = "Tu signo es Tauro";

						} else {
							mensaje = "Error de datos";

						}

					}

				} else {
					if (mes.equalsIgnoreCase("mayo")) {
						if (dia >= 1 && dia <= 21) {
							mensaje = "Tu signo es Tauro";
						} else {
							if (dia >= 22 && dia <= 31) {
								mensaje = "Tu signo es Geminis";

							} else {
								mensaje = "Error ingreso de datos";

							}

						}

					} else {
						if (mes.equalsIgnoreCase("junio")) {
							if (dia >= 1 && dia <= 21) {
								mensaje = "Tu signo es Géminis";

							} else {
								if (dia >= 22 && dia <= 30) {
									mensaje = "Tu signo es Cancer";

								} else {
									mensaje = "Error de tipeo de datos";

								}

							}

						} else {
							if (mes.equalsIgnoreCase("julio")) {
								if (dia >= 1 && dia <= 22) {
									mensaje = "Tu signo es cancer";

								} else {
									if (dia >= 23 && dia <= 31) {
										mensaje = "Tu signo es leo";

									} else {
										mensaje = "Error de tipeo";

									}

								}
							} else {
								if (mes.equalsIgnoreCase("agosto")) {
									if (dia >= 1 && dia <= 23) {
										mensaje = "Tu signo es leo";

									} else {
										if (dia >= 23 && dia <= 31) {
											mensaje = "Tu signo es Virgo";

										} else {
											mensaje = "Error de tiepo";

										}

									}

								} else {
									if (mes.equalsIgnoreCase("septiembre")) {
										if (dia >= 1 && dia <= 23) {
											mensaje = "Tu signo es virgo";

										} else {
											if (dia >= 24 && dia <= 30) {
												mensaje = "Tu signo es Libra";

											} else {
												mensaje = "Error de tipeo";

											}

										}
									} else {
										if (mes.equalsIgnoreCase("octubre")) {
											if (dia >= 1 && dia <= 23) {
												mensaje = "Tu signo es libra";

											} else {
												if (dia >= 24 && dia <= 31) {
													mensaje = "Tu signo es escorpio";
												} else {
													mensaje = "Error de tipeo";

												}

											}

										} else {
											if (mes.equalsIgnoreCase("noviembre")) {
												if (dia >= 1 && dia <= 22) {
													mensaje = "Tu signo es escorpio";
												} else {
													if (dia >= 23 && dia <= 30) {
														mensaje = "Tu signo es sagitario";
													} else {
														mensaje = "Error de tipeo";

													}

												}
											} else {
												if (mes.equalsIgnoreCase("diciembre")) {
													if (dia >= 1 && dia <= 21) {
														mensaje = "Tu signo es Sagiratio";
													} else {
														if (dia>=22 && dia <=31) {
															mensaje="Tu signo es capricornio";
															
														} else {
															mensaje="Error de datos";

														}

													}
												} else {
													if (mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("marzo") || mes.equalsIgnoreCase("mayo") || mes.equalsIgnoreCase("julio") || mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("octubre") || mes.equalsIgnoreCase("diciembre") ) {
														if (dia>= 31) {
															mensaje="Error de tipeo";
														} else {
															if (mes.equalsIgnoreCase("febrero") && dia>=29) {
																mensaje="Error de tipeo";
															} 

														
														

												}

											}

										}

									}

								}

							}

						}

					}

				}

			}

		}
				
				
		}

			JOptionPane.showMessageDialog(null, mensaje);

	}
		}}


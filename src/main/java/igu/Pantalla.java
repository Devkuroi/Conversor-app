/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;



/**
 *
 * @author usuario
 */
public class Pantalla extends javax.swing.JFrame {

    private static final double EUR_TO_USD = 0.90;
    private static final double GBP_TO_USD = 0.78;
    private static final double COP_TO_USD = 3955.75;
    private static final double KRW_TO_USD = 1287.23;
    private static final double JPY_TO_USD = 141.64;

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Conversores = new javax.swing.JComboBox<>();
        ConversorOrigen = new javax.swing.JComboBox<>();
        ConversorDestino = new javax.swing.JComboBox<>();
        ValorConvertir = new javax.swing.JTextField();
        ValorConvertido = new javax.swing.JTextField();
        Convertir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Conversores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Divisas", "Temperaturas", "Pesos", "Distancias" }));
        Conversores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversoresActionPerformed(evt);
            }
        });

        ConversorOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "Euro", "Libra Esterlina", "COP", "Won surcoreano", "Yen" }));

        ConversorDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "Euro", "Libra Esterlina", "COP", "Won surcoreano", "Yen" }));
        ConversorDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversorDestinoActionPerformed(evt);
            }
        });

        ValorConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorConvertirKeyTyped(evt);
            }
        });

        ValorConvertido.setForeground(new java.awt.Color(0, 0, 0));
        ValorConvertido.setText("0");
        ValorConvertido.setEnabled(false);

        Convertir.setText("Convertir");
        Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("De:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("A:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ValorConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ValorConvertido))
                    .addComponent(Conversores, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConversorOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(ConversorDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Conversores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConversorDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConversorOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConversoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversoresActionPerformed
        String Selected = Conversores.getSelectedItem().toString();

        switch (Selected) {
            case "Divisas":
                ConversorOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"USD", "Euro", "Libra Esterlina", "COP", "Won surcoreano", "Yen"}));
                ConversorDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"USD", "Euro", "Libra Esterlina", "COP", "Won surcoreano", "Yen"}));
                break;
            case "Temperaturas":
                ConversorOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Celsius", "Fahrenheit", "Kelvin"}));
                ConversorDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Celsius", "Fahrenheit", "Kelvin"}));
                break;
            case "Pesos":
                ConversorOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Kilogramo", "Libra"}));
                ConversorDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Kilogramo", "Libra"}));
                break;
            case "Distancias":
                ConversorOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Kilómetro", "Milla"}));
                ConversorDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Kilómetro", "Milla"}));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_ConversoresActionPerformed

    private void ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirActionPerformed
        try {
            convertir();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes colocar un numero.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConvertirActionPerformed

    private void ValorConvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorConvertirKeyTyped
        char c = evt.getKeyChar();
        String text = ValorConvertir.getText();
        String tipoConversorSeleccionado = Conversores.getSelectedItem().toString();

        if (Character.isDigit(c) || c == '.') {
            if (c == '.' && text.contains(".")) {
                evt.consume();
            }
        } else if (tipoConversorSeleccionado.equals("Temperaturas")) {
            if (c == '-' && text.indexOf('-') == -1 && text.isEmpty()) {
                return;
            } else if (!Character.isDigit(c) || (c == '-' && text.indexOf('-') != 0)) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_ValorConvertirKeyTyped

    private void ConversorDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversorDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConversorDestinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ConversorDestino;
    private javax.swing.JComboBox<String> ConversorOrigen;
    private javax.swing.JComboBox<String> Conversores;
    private javax.swing.JButton Convertir;
    private javax.swing.JTextField ValorConvertido;
    private javax.swing.JTextField ValorConvertir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
            
    
    private void convertir() {
        String tipoConversor = Conversores.getSelectedItem().toString();
        String Origen = ConversorOrigen.getSelectedItem().toString();
        String Destino = ConversorDestino.getSelectedItem().toString();
        double valor = Double.parseDouble(ValorConvertir.getText());

        double resultado = 0.0;

        java.text.DecimalFormat df2 = new java.text.DecimalFormat("0.00");
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00000");
        String resultadoFormateado = "";

        switch (tipoConversor) {
            case "Divisas":
                resultado = convertirDivisas(Origen, Destino, valor);
                if (Origen.equals("COP") && (Destino.equals("USD") || Destino.equals("Euro") || Destino.equals("Libra Esterlina")) && resultado < 0.01) {
                    resultadoFormateado = df.format(resultado);
                } else if (Origen.equals("Won surcoreano") && (Destino.equals("USD") || Destino.equals("Euro") || Destino.equals("Libra Esterlina")) && resultado < 0.01) {
                    resultadoFormateado = df.format(resultado);
                } else if (Origen.equals("Yen") && (Destino.equals("USD") || Destino.equals("Euro") || Destino.equals("Libra Esterlina")) && resultado < 0.01) {
                    resultadoFormateado = df.format(resultado);
                } else {
                    resultadoFormateado = df2.format(resultado);
                }
                break;
            case "Temperaturas":
                resultado = convertirTemperatura(Origen, Destino, valor);
                resultadoFormateado = df2.format(resultado);
                break;
            case "Pesos":
                resultado = convertirPeso(Origen, Destino, valor);
                resultadoFormateado = df2.format(resultado);
                break;
            case "Distancias":
                resultado = convertirDistancia(Origen, Destino, valor);
                resultadoFormateado = df2.format(resultado);
                break;
            default:
                break;
        }

        ValorConvertido.setText(resultadoFormateado);
    }

    private double obtenerTasa(String moneda) {
        double tasaCambio = 1.0;

        switch (moneda) {
            case "USD":
                tasaCambio = 1.0;
                break;
            case "Euro":
                tasaCambio = EUR_TO_USD;
                break;
            case "Libra Esterlina":
                tasaCambio = GBP_TO_USD;
                break;
            case "COP":
                tasaCambio = COP_TO_USD;
                break;
            case "Won surcoreano":
                tasaCambio = KRW_TO_USD;
                break;
            case "Yen":
                tasaCambio = JPY_TO_USD;
                break;
        }

        return tasaCambio;
    }

    private double convertirDivisas(String monedaOrigen, String monedaDestino, double valor) {
        double tasaCambioOrigen = obtenerTasa(monedaOrigen);
        double tasaCambioDestino = obtenerTasa(monedaDestino);
        return valor * (1 / tasaCambioOrigen) * tasaCambioDestino;
    }

    private double convertirTemperatura(String unidadOrigen, String unidadDestino, double valor) {
        double resultado = 0.0;

        switch (unidadOrigen) {
            case "Celsius":
                switch (unidadDestino) {
                    case "Fahrenheit":
                        resultado = (valor * 9 / 5) + 32;
                        break;
                    case "Kelvin":
                        resultado = valor + 273.15;
                        break;
                    default:
                        resultado = valor;
                        break;
                }
                break;
            case "Fahrenheit":
                switch (unidadDestino) {
                    case "Celsius":
                        resultado = (valor - 32) * 5 / 9;
                        break;
                    case "Kelvin":
                        resultado = (valor + 459.67) * 5 / 9;
                        break;
                    default:
                        resultado = valor;
                        break;
                }
                break;
            default:
                switch (unidadDestino) {
                    case "Celsius":
                        resultado = valor - 273.15;
                        break;
                    case "Fahrenheit":
                        resultado = (valor * 9 / 5) - 459.67;
                        break;
                    default:
                        resultado = valor;
                        break;
                }
                break;
        }

        return resultado;
    }

    private double convertirPeso(String unidadOrigen, String unidadDestino, double valor) {
        double resultado = 0.0;

        if (unidadOrigen.equals("Kilogramo")) {
            if (unidadDestino.equals("Libra")) {
                resultado = valor * 2.20462;
            } else {
                resultado = valor;
            }
        } else if (unidadOrigen.equals("Libra")) {
            if (unidadDestino.equals("Kilogramo")) {
                resultado = valor * 0.453592;
            } else {
                resultado = valor;
            }
        }

        return resultado;
    }

    private double convertirDistancia(String unidadOrigen, String unidadDestino, double valor) {
        double resultado = 0.0;

        if (unidadOrigen.equals("Kilómetro")) {
            if (unidadDestino.equals("Milla")) {
                resultado = valor * 0.621371;
            } else {
                resultado = valor;
            }
        } else if (unidadOrigen.equals("Milla")) {
            if (unidadDestino.equals("Kilómetro")) {
                resultado = valor * 1.60934;
            } else {
                resultado = valor;
            }
        }

        return resultado;
    }
}

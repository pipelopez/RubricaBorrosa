package rubricaborrosa;

import java.util.*;
import javax.swing.*;

public class VentanaPrincipal2 extends javax.swing.JFrame
{
    ArrayList<Variable> listaVariablesEntrada = new ArrayList();
    ArrayList<Variable> listaVariablesSalida = new ArrayList();
    ArrayList<FuncionPertenencia> listaFP;
    
    DefaultListModel<String> listaVariablesImpresaE = new  DefaultListModel();
    DefaultListModel<String> listaVariablesImpresaS = new  DefaultListModel();
    DefaultListModel<String> listaFPImpresa = new  DefaultListModel();
    
    int contaVariablesE, contaVariablesS, contaFP;
    int indiceVariableSeleccionadoE, indiceVariableSeleccionadoS, indiceFPSeleccionado;
    
    public VentanaPrincipal2()
    {
        initComponents();
        setLocationRelativeTo(null);
        
        jlListaVariablesEntrada.setModel(listaVariablesImpresaE);
        jlListaVariablesSalida.setModel(listaVariablesImpresaS);
        jlFuncionesP.setModel(listaFPImpresa);
        
        listaFPImpresa.addElement("cxvcx");
        listaFPImpresa.addElement("dsfsd");
        listaFPImpresa.addElement("wewwer");
        
        contaVariablesE = 0;
        contaVariablesS = 0;
        contaFP = 0;
        
        indiceVariableSeleccionadoE = -1;
        indiceVariableSeleccionadoS = -1;
        indiceFPSeleccionado = -1;
    }
    
    public void limpiarVariable()
    {
        jtfNombreVariable.setText("");
        jtfRangoVariable.setText("");
        jtfResolucionVariable.setText("");
        jcbTipoVariable.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpPanelPrincipal = new javax.swing.JTabbedPane();
        jpPestanaVariables = new javax.swing.JPanel();
        jpPanelIngresoVariables = new javax.swing.JPanel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jtfNombreVariable = new javax.swing.JTextField();
        jtfRangoVariable = new javax.swing.JTextField();
        jtfResolucionVariable = new javax.swing.JTextField();
        jcbTipoVariable = new javax.swing.JComboBox();
        jbRegistrarVariable = new javax.swing.JButton();
        jtpVariablesRegistradas = new javax.swing.JTabbedPane();
        jpPestanaVariablesDeEntrada = new javax.swing.JPanel();
        jspListaVariablesEntrada = new javax.swing.JScrollPane();
        jlListaVariablesEntrada = new javax.swing.JList();
        jpPestanaVariablesDeSalida = new javax.swing.JPanel();
        jspListaVariablesSalida = new javax.swing.JScrollPane();
        jlListaVariablesSalida = new javax.swing.JList();
        jpFuncionesPertenencia = new javax.swing.JPanel();
        jspFuncionesP = new javax.swing.JScrollPane();
        jlFuncionesP = new javax.swing.JList();
        jpParametrosFuncionesP = new javax.swing.JPanel();
        jl5 = new javax.swing.JLabel();
        jl6 = new javax.swing.JLabel();
        jtfNombreEtiqueta = new javax.swing.JTextField();
        jtfGradosPEtiqueta = new javax.swing.JTextField();
        jbAgregarEtiqueta = new javax.swing.JButton();
        jbActualizarEtiqueta = new javax.swing.JButton();
        jbEliminarEtiqueta = new javax.swing.JButton();
        jpDibujoFuncionesP = new javax.swing.JPanel();
        jpPestanaReglas = new javax.swing.JPanel();
        jpOperacionesReglas = new javax.swing.JPanel();
        jbAnadirRegla = new javax.swing.JButton();
        jbEliminarRegla = new javax.swing.JButton();
        jbActualizarRegla = new javax.swing.JButton();
        jpBaseReglas = new javax.swing.JPanel();
        jspBaseReglas = new javax.swing.JScrollPane();
        jtListaBaseReglas = new javax.swing.JTable();
        jl7 = new javax.swing.JLabel();
        jl8 = new javax.swing.JLabel();
        jl9 = new javax.swing.JLabel();
        jtfSiguienteNumRegla = new javax.swing.JTextField();
        jspAntecedente = new javax.swing.JScrollPane();
        jtaAntecedente = new javax.swing.JTextArea();
        jspConsecuente = new javax.swing.JScrollPane();
        jtaConsecuente = new javax.swing.JTextArea();
        jpPestanaEstructura = new javax.swing.JPanel();
        jpListaCompetencias = new javax.swing.JPanel();
        jspListaCompetencias = new javax.swing.JScrollPane();
        jtListaCompetencias = new javax.swing.JTable();
        jl10 = new javax.swing.JLabel();
        jl11 = new javax.swing.JLabel();
        jl12 = new javax.swing.JLabel();
        jsNumeroCompetencias = new javax.swing.JSpinner();
        jtfCriterios = new javax.swing.JTextField();
        jtfActores = new javax.swing.JTextField();
        jpFunciones = new javax.swing.JPanel();
        jbConfirmarEstructura = new javax.swing.JButton();
        jbGuardarDatosEstructura = new javax.swing.JButton();
        jbCarguarDatosEstructura = new javax.swing.JButton();
        jbLimpiarDatosEstructura = new javax.swing.JButton();
        jpPestanaValoracion = new javax.swing.JPanel();
        jmbMenuPrincipal = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiAbrirFCL = new javax.swing.JMenuItem();
        jmiGuardarFCL = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmConfiguracion = new javax.swing.JMenu();
        jmAyuda = new javax.swing.JMenu();
        jmiDoc = new javax.swing.JMenuItem();
        jmiAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RUBRICA BORROSA");

        jtpPanelPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jpPanelIngresoVariables.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nueva Variable", 2, 0, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(0, 0, 0))); // NOI18N

        jl1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl1.setText("Nombre:");

        jl2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl2.setText("Rango:");

        jl3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl3.setText("Resolución:");

        jl4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl4.setText("Tipo:");

        jtfNombreVariable.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jtfRangoVariable.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jtfResolucionVariable.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jcbTipoVariable.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jcbTipoVariable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "De entrada", "De salida" }));

        jbRegistrarVariable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbRegistrarVariable.setText("Registrar");
        jbRegistrarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarVariableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPanelIngresoVariablesLayout = new javax.swing.GroupLayout(jpPanelIngresoVariables);
        jpPanelIngresoVariables.setLayout(jpPanelIngresoVariablesLayout);
        jpPanelIngresoVariablesLayout.setHorizontalGroup(
            jpPanelIngresoVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelIngresoVariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPanelIngresoVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl3)
                    .addComponent(jl2)
                    .addComponent(jl1)
                    .addComponent(jl4))
                .addGap(18, 18, 18)
                .addGroup(jpPanelIngresoVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbTipoVariable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNombreVariable)
                    .addComponent(jtfRangoVariable)
                    .addComponent(jtfResolucionVariable))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPanelIngresoVariablesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbRegistrarVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jpPanelIngresoVariablesLayout.setVerticalGroup(
            jpPanelIngresoVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPanelIngresoVariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPanelIngresoVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl1)
                    .addComponent(jtfNombreVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPanelIngresoVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl2)
                    .addComponent(jtfRangoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPanelIngresoVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl3)
                    .addComponent(jtfResolucionVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPanelIngresoVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl4)
                    .addComponent(jcbTipoVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbRegistrarVariable)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jtpVariablesRegistradas.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jlListaVariablesEntrada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlListaVariablesEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListaVariablesEntradaMouseClicked(evt);
            }
        });
        jspListaVariablesEntrada.setViewportView(jlListaVariablesEntrada);

        javax.swing.GroupLayout jpPestanaVariablesDeEntradaLayout = new javax.swing.GroupLayout(jpPestanaVariablesDeEntrada);
        jpPestanaVariablesDeEntrada.setLayout(jpPestanaVariablesDeEntradaLayout);
        jpPestanaVariablesDeEntradaLayout.setHorizontalGroup(
            jpPestanaVariablesDeEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPestanaVariablesDeEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspListaVariablesEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpPestanaVariablesDeEntradaLayout.setVerticalGroup(
            jpPestanaVariablesDeEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPestanaVariablesDeEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspListaVariablesEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpVariablesRegistradas.addTab("Entrada", jpPestanaVariablesDeEntrada);

        jlListaVariablesSalida.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlListaVariablesSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlListaVariablesSalidaMouseClicked(evt);
            }
        });
        jspListaVariablesSalida.setViewportView(jlListaVariablesSalida);

        javax.swing.GroupLayout jpPestanaVariablesDeSalidaLayout = new javax.swing.GroupLayout(jpPestanaVariablesDeSalida);
        jpPestanaVariablesDeSalida.setLayout(jpPestanaVariablesDeSalidaLayout);
        jpPestanaVariablesDeSalidaLayout.setHorizontalGroup(
            jpPestanaVariablesDeSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPestanaVariablesDeSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspListaVariablesSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpPestanaVariablesDeSalidaLayout.setVerticalGroup(
            jpPestanaVariablesDeSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPestanaVariablesDeSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspListaVariablesSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpVariablesRegistradas.addTab("Salida", jpPestanaVariablesDeSalida);

        jpFuncionesPertenencia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Funciones De Pertenencia", 2, 0, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(0, 0, 0))); // NOI18N

        jlFuncionesP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlFuncionesP.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "fgdf", "ds" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jspFuncionesP.setViewportView(jlFuncionesP);

        javax.swing.GroupLayout jpFuncionesPertenenciaLayout = new javax.swing.GroupLayout(jpFuncionesPertenencia);
        jpFuncionesPertenencia.setLayout(jpFuncionesPertenenciaLayout);
        jpFuncionesPertenenciaLayout.setHorizontalGroup(
            jpFuncionesPertenenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFuncionesPertenenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspFuncionesP, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpFuncionesPertenenciaLayout.setVerticalGroup(
            jpFuncionesPertenenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFuncionesPertenenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspFuncionesP)
                .addContainerGap())
        );

        jpParametrosFuncionesP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Parámetros Función", 2, 0, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(0, 0, 0))); // NOI18N

        jl5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl5.setText("Nombre Etiqueta");

        jl6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl6.setText("Grados de pertenencia");

        jtfNombreEtiqueta.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jtfGradosPEtiqueta.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jbAgregarEtiqueta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbAgregarEtiqueta.setText("Agregar");
        jbAgregarEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarEtiquetaActionPerformed(evt);
            }
        });

        jbActualizarEtiqueta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbActualizarEtiqueta.setText("Actualizar");
        jbActualizarEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarEtiquetaActionPerformed(evt);
            }
        });

        jbEliminarEtiqueta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbEliminarEtiqueta.setText("Eliminar");
        jbEliminarEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarEtiquetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpParametrosFuncionesPLayout = new javax.swing.GroupLayout(jpParametrosFuncionesP);
        jpParametrosFuncionesP.setLayout(jpParametrosFuncionesPLayout);
        jpParametrosFuncionesPLayout.setHorizontalGroup(
            jpParametrosFuncionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpParametrosFuncionesPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpParametrosFuncionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNombreEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfGradosPEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpParametrosFuncionesPLayout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jbAgregarEtiqueta)
                .addGap(18, 18, 18)
                .addComponent(jbActualizarEtiqueta)
                .addGap(18, 18, 18)
                .addComponent(jbEliminarEtiqueta)
                .addGap(28, 28, 28))
        );
        jpParametrosFuncionesPLayout.setVerticalGroup(
            jpParametrosFuncionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpParametrosFuncionesPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfNombreEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl6)
                .addGap(18, 18, 18)
                .addComponent(jtfGradosPEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpParametrosFuncionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbEliminarEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAgregarEtiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbActualizarEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jpDibujoFuncionesP.setBackground(new java.awt.Color(255, 255, 255));
        jpDibujoFuncionesP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jpDibujoFuncionesPLayout = new javax.swing.GroupLayout(jpDibujoFuncionesP);
        jpDibujoFuncionesP.setLayout(jpDibujoFuncionesPLayout);
        jpDibujoFuncionesPLayout.setHorizontalGroup(
            jpDibujoFuncionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpDibujoFuncionesPLayout.setVerticalGroup(
            jpDibujoFuncionesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpPestanaVariablesLayout = new javax.swing.GroupLayout(jpPestanaVariables);
        jpPestanaVariables.setLayout(jpPestanaVariablesLayout);
        jpPestanaVariablesLayout.setHorizontalGroup(
            jpPestanaVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPestanaVariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPestanaVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpPanelIngresoVariables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtpVariablesRegistradas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPestanaVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPestanaVariablesLayout.createSequentialGroup()
                        .addComponent(jpFuncionesPertenencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpParametrosFuncionesP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpDibujoFuncionesP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpPestanaVariablesLayout.setVerticalGroup(
            jpPestanaVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPestanaVariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPestanaVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpDibujoFuncionesP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpPanelIngresoVariables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPestanaVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtpVariablesRegistradas)
                    .addComponent(jpFuncionesPertenencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpParametrosFuncionesP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jtpPanelPrincipal.addTab("Variables", jpPestanaVariables);

        jpOperacionesReglas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operaciones", 2, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jbAnadirRegla.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbAnadirRegla.setText("<html>Añadir<br>Regla</html>");

        jbEliminarRegla.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbEliminarRegla.setText("<html>Eliminar<br>Regla</html>");

        jbActualizarRegla.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbActualizarRegla.setText("<html>Actualizar<br>Regla</html>");

        javax.swing.GroupLayout jpOperacionesReglasLayout = new javax.swing.GroupLayout(jpOperacionesReglas);
        jpOperacionesReglas.setLayout(jpOperacionesReglasLayout);
        jpOperacionesReglasLayout.setHorizontalGroup(
            jpOperacionesReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOperacionesReglasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpOperacionesReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOperacionesReglasLayout.createSequentialGroup()
                        .addComponent(jbAnadirRegla, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jbActualizarRegla, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jpOperacionesReglasLayout.createSequentialGroup()
                        .addComponent(jbEliminarRegla, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpOperacionesReglasLayout.setVerticalGroup(
            jpOperacionesReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOperacionesReglasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpOperacionesReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbActualizarRegla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAnadirRegla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbEliminarRegla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jpBaseReglas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Base de Reglas", 2, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jtListaBaseReglas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtListaBaseReglas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NUMERO", "SI", "ENTONCES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspBaseReglas.setViewportView(jtListaBaseReglas);

        javax.swing.GroupLayout jpBaseReglasLayout = new javax.swing.GroupLayout(jpBaseReglas);
        jpBaseReglas.setLayout(jpBaseReglasLayout);
        jpBaseReglasLayout.setHorizontalGroup(
            jpBaseReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseReglasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspBaseReglas)
                .addContainerGap())
        );
        jpBaseReglasLayout.setVerticalGroup(
            jpBaseReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBaseReglasLayout.createSequentialGroup()
                .addComponent(jspBaseReglas, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        jl7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl7.setText("Numero Siguiente Regla:");

        jl8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl8.setText("Antecedente:");

        jl9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl9.setText("Consecuente:");

        jtfSiguienteNumRegla.setBackground(new java.awt.Color(204, 204, 204));
        jtfSiguienteNumRegla.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtfSiguienteNumRegla.setText("Numero generado de manera automatica");
        jtfSiguienteNumRegla.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        jtfSiguienteNumRegla.setEnabled(false);

        jtaAntecedente.setColumns(20);
        jtaAntecedente.setRows(3);
        jspAntecedente.setViewportView(jtaAntecedente);

        jtaConsecuente.setColumns(20);
        jtaConsecuente.setRows(3);
        jspConsecuente.setViewportView(jtaConsecuente);

        javax.swing.GroupLayout jpPestanaReglasLayout = new javax.swing.GroupLayout(jpPestanaReglas);
        jpPestanaReglas.setLayout(jpPestanaReglasLayout);
        jpPestanaReglasLayout.setHorizontalGroup(
            jpPestanaReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPestanaReglasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPestanaReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBaseReglas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpPestanaReglasLayout.createSequentialGroup()
                        .addGroup(jpPestanaReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl7)
                            .addComponent(jl8)
                            .addComponent(jl9))
                        .addGap(18, 18, 18)
                        .addGroup(jpPestanaReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSiguienteNumRegla)
                            .addComponent(jspAntecedente)
                            .addComponent(jspConsecuente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jpOperacionesReglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpPestanaReglasLayout.setVerticalGroup(
            jpPestanaReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPestanaReglasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPestanaReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPestanaReglasLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jpPestanaReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfSiguienteNumRegla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl7))
                        .addGap(18, 18, 18)
                        .addGroup(jpPestanaReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jspAntecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpPestanaReglasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl9)
                            .addComponent(jspConsecuente)))
                    .addComponent(jpOperacionesReglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpBaseReglas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpPanelPrincipal.addTab("Reglas", jpPestanaReglas);

        jpListaCompetencias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista competencias", 2, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jtListaCompetencias.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jtListaCompetencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Nivel", "Verbo", "Complemento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jspListaCompetencias.setViewportView(jtListaCompetencias);

        javax.swing.GroupLayout jpListaCompetenciasLayout = new javax.swing.GroupLayout(jpListaCompetencias);
        jpListaCompetencias.setLayout(jpListaCompetenciasLayout);
        jpListaCompetenciasLayout.setHorizontalGroup(
            jpListaCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaCompetenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspListaCompetencias)
                .addContainerGap())
        );
        jpListaCompetenciasLayout.setVerticalGroup(
            jpListaCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaCompetenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspListaCompetencias, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        jl10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl10.setText("Numero de competencias:");

        jl11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl11.setText("Criterios del sistema:");

        jl12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jl12.setText("Actores del sistema:");

        jsNumeroCompetencias.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jtfCriterios.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jtfActores.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jpFunciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Funciones", 2, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jbConfirmarEstructura.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jbConfirmarEstructura.setText("Confirmar");

        jbGuardarDatosEstructura.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jbGuardarDatosEstructura.setText("Guardar");

        jbCarguarDatosEstructura.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jbCarguarDatosEstructura.setText("Cargar");

        jbLimpiarDatosEstructura.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jbLimpiarDatosEstructura.setText("Limpiar");

        javax.swing.GroupLayout jpFuncionesLayout = new javax.swing.GroupLayout(jpFunciones);
        jpFunciones.setLayout(jpFuncionesLayout);
        jpFuncionesLayout.setHorizontalGroup(
            jpFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFuncionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbCarguarDatosEstructura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbConfirmarEstructura, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGuardarDatosEstructura, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jbLimpiarDatosEstructura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFuncionesLayout.setVerticalGroup(
            jpFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFuncionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbConfirmarEstructura, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jbGuardarDatosEstructura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCarguarDatosEstructura, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jbLimpiarDatosEstructura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpPestanaEstructuraLayout = new javax.swing.GroupLayout(jpPestanaEstructura);
        jpPestanaEstructura.setLayout(jpPestanaEstructuraLayout);
        jpPestanaEstructuraLayout.setHorizontalGroup(
            jpPestanaEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPestanaEstructuraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPestanaEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpListaCompetencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpPestanaEstructuraLayout.createSequentialGroup()
                        .addGroup(jpPestanaEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl10)
                            .addComponent(jl11)
                            .addComponent(jl12))
                        .addGap(60, 60, 60)
                        .addGroup(jpPestanaEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCriterios)
                            .addComponent(jtfActores)
                            .addComponent(jsNumeroCompetencias, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jpFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpPestanaEstructuraLayout.setVerticalGroup(
            jpPestanaEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPestanaEstructuraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPestanaEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPestanaEstructuraLayout.createSequentialGroup()
                        .addComponent(jpFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPestanaEstructuraLayout.createSequentialGroup()
                        .addGroup(jpPestanaEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl10)
                            .addComponent(jsNumeroCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpPestanaEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl11))
                        .addGap(23, 23, 23)
                        .addGroup(jpPestanaEstructuraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfActores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl12))
                        .addGap(29, 29, 29)))
                .addComponent(jpListaCompetencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpPanelPrincipal.addTab("Estructura", jpPestanaEstructura);

        javax.swing.GroupLayout jpPestanaValoracionLayout = new javax.swing.GroupLayout(jpPestanaValoracion);
        jpPestanaValoracion.setLayout(jpPestanaValoracionLayout);
        jpPestanaValoracionLayout.setHorizontalGroup(
            jpPestanaValoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
        );
        jpPestanaValoracionLayout.setVerticalGroup(
            jpPestanaValoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jtpPanelPrincipal.addTab("Valoración", jpPestanaValoracion);

        jmbMenuPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jmArchivo.setText("Archivo");
        jmArchivo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jmiAbrirFCL.setText("Abrir FCL");
        jmArchivo.add(jmiAbrirFCL);

        jmiGuardarFCL.setText("Guardar FCL");
        jmArchivo.add(jmiGuardarFCL);

        jmiSalir.setText("Salir");
        jmArchivo.add(jmiSalir);

        jmbMenuPrincipal.add(jmArchivo);

        jmConfiguracion.setText("Configuración");
        jmConfiguracion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jmConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmConfiguracionMouseClicked(evt);
            }
        });
        jmbMenuPrincipal.add(jmConfiguracion);

        jmAyuda.setText("Ayuda");
        jmAyuda.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jmiDoc.setText("Documentación");
        jmAyuda.add(jmiDoc);

        jmiAcerca.setText("Acerca de...");
        jmAyuda.add(jmiAcerca);

        jmbMenuPrincipal.add(jmAyuda);

        setJMenuBar(jmbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPanelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmConfiguracionMouseClicked
        VentanaConfiguracion vc = new VentanaConfiguracion();
        vc.setVisible(true);
    }//GEN-LAST:event_jmConfiguracionMouseClicked

    private void jbRegistrarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarVariableActionPerformed
        if ((!jtfNombreVariable.getText().equals("")) & (!jtfRangoVariable.getText().equals("")) & (!jtfResolucionVariable.getText().equals("")))
        {
            Variable nuevaV = new Variable(jtfNombreVariable.getText(), jtfRangoVariable.getText(), Integer.parseInt(jtfResolucionVariable.getText()));
            
            System.out.println("algo");
            
            if (jcbTipoVariable.getSelectedIndex() == 0)
            {
                listaVariablesEntrada.add(nuevaV);
                listaVariablesImpresaE.addElement(jtfNombreVariable.getText());
                contaVariablesE = contaVariablesE + 1;
            }
            else
            {                
                listaVariablesSalida.add(nuevaV);
                listaVariablesImpresaS.addElement(jtfNombreVariable.getText());
                contaVariablesS = contaVariablesS + 1;
            }
            
            //limpiarVariable();
            
        }
        else
        {
               JOptionPane.showMessageDialog(null, "Recuerde que todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbRegistrarVariableActionPerformed

    private void jlListaVariablesEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListaVariablesEntradaMouseClicked
        indiceVariableSeleccionadoE = jlListaVariablesEntrada.getSelectedIndex();
        
        if (indiceVariableSeleccionadoE != -1)
        {
            jlListaVariablesSalida.setSelectedIndex(-1);
            listaFP = listaVariablesEntrada.get(indiceVariableSeleccionadoE).getListaFuncionesP();
            
            contaFP = listaFP.size();
            
            if (contaFP != 0)
            {
                
            }
            else
            {
//////                DefaultListModel listaVE = (DefaultListModel) jlFuncionesP.getModel();
//////                listaVE.removeAllElements();
//////                listaFP.clear();
            }
        }
    }//GEN-LAST:event_jlListaVariablesEntradaMouseClicked

    private void jlListaVariablesSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlListaVariablesSalidaMouseClicked
        indiceVariableSeleccionadoS = jlListaVariablesSalida.getSelectedIndex();
        
        if (indiceVariableSeleccionadoS != -1)
        {
            jlListaVariablesEntrada.setSelectedIndex(-1);
            listaFP = listaVariablesSalida.get(indiceVariableSeleccionadoS).getListaFuncionesP();
            
            contaFP = listaFP.size();
            
            if (contaFP != 0)
            {
                
            }
            else
            {
//////                DefaultListModel listaVE = (DefaultListModel) jlFuncionesP.getModel();
//////                listaVE.removeAllElements();
//////                listaFP.clear();
            }
            
        }
    }//GEN-LAST:event_jlListaVariablesSalidaMouseClicked

    private void jbAgregarEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarEtiquetaActionPerformed
        if (!jtfNombreEtiqueta.getText().equals("") & !jtfGradosPEtiqueta.getText().equals(""))
        {
            FuncionPertenencia nuevaF = new FuncionPertenencia(jtfNombreEtiqueta.getText(), jtfGradosPEtiqueta.getText());
            
            
////            if (jlListaVariablesEntrada.getSelectedIndex() )
////            {
////                
////            }
////            else
////            {
////                
////            }
        }
    }//GEN-LAST:event_jbAgregarEtiquetaActionPerformed

    private void jbActualizarEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarEtiquetaActionPerformed
        
    }//GEN-LAST:event_jbActualizarEtiquetaActionPerformed

    private void jbEliminarEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarEtiquetaActionPerformed
        
    }//GEN-LAST:event_jbEliminarEtiquetaActionPerformed
    
    

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbActualizarEtiqueta;
    private javax.swing.JButton jbActualizarRegla;
    private javax.swing.JButton jbAgregarEtiqueta;
    private javax.swing.JButton jbAnadirRegla;
    private javax.swing.JButton jbCarguarDatosEstructura;
    private javax.swing.JButton jbConfirmarEstructura;
    private javax.swing.JButton jbEliminarEtiqueta;
    private javax.swing.JButton jbEliminarRegla;
    private javax.swing.JButton jbGuardarDatosEstructura;
    private javax.swing.JButton jbLimpiarDatosEstructura;
    private javax.swing.JButton jbRegistrarVariable;
    private javax.swing.JComboBox jcbTipoVariable;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl10;
    private javax.swing.JLabel jl11;
    private javax.swing.JLabel jl12;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jl9;
    private javax.swing.JList jlFuncionesP;
    private javax.swing.JList jlListaVariablesEntrada;
    private javax.swing.JList jlListaVariablesSalida;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenu jmConfiguracion;
    private javax.swing.JMenuBar jmbMenuPrincipal;
    private javax.swing.JMenuItem jmiAbrirFCL;
    private javax.swing.JMenuItem jmiAcerca;
    private javax.swing.JMenuItem jmiDoc;
    private javax.swing.JMenuItem jmiGuardarFCL;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JPanel jpBaseReglas;
    private javax.swing.JPanel jpDibujoFuncionesP;
    private javax.swing.JPanel jpFunciones;
    private javax.swing.JPanel jpFuncionesPertenencia;
    private javax.swing.JPanel jpListaCompetencias;
    private javax.swing.JPanel jpOperacionesReglas;
    private javax.swing.JPanel jpPanelIngresoVariables;
    private javax.swing.JPanel jpParametrosFuncionesP;
    private javax.swing.JPanel jpPestanaEstructura;
    private javax.swing.JPanel jpPestanaReglas;
    private javax.swing.JPanel jpPestanaValoracion;
    private javax.swing.JPanel jpPestanaVariables;
    private javax.swing.JPanel jpPestanaVariablesDeEntrada;
    private javax.swing.JPanel jpPestanaVariablesDeSalida;
    private javax.swing.JSpinner jsNumeroCompetencias;
    private javax.swing.JScrollPane jspAntecedente;
    private javax.swing.JScrollPane jspBaseReglas;
    private javax.swing.JScrollPane jspConsecuente;
    private javax.swing.JScrollPane jspFuncionesP;
    private javax.swing.JScrollPane jspListaCompetencias;
    private javax.swing.JScrollPane jspListaVariablesEntrada;
    private javax.swing.JScrollPane jspListaVariablesSalida;
    private javax.swing.JTable jtListaBaseReglas;
    private javax.swing.JTable jtListaCompetencias;
    private javax.swing.JTextArea jtaAntecedente;
    private javax.swing.JTextArea jtaConsecuente;
    private javax.swing.JTextField jtfActores;
    private javax.swing.JTextField jtfCriterios;
    private javax.swing.JTextField jtfGradosPEtiqueta;
    private javax.swing.JTextField jtfNombreEtiqueta;
    private javax.swing.JTextField jtfNombreVariable;
    private javax.swing.JTextField jtfRangoVariable;
    private javax.swing.JTextField jtfResolucionVariable;
    private javax.swing.JTextField jtfSiguienteNumRegla;
    private javax.swing.JTabbedPane jtpPanelPrincipal;
    private javax.swing.JTabbedPane jtpVariablesRegistradas;
    // End of variables declaration//GEN-END:variables
}



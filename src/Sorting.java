import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Sorting extends javax.swing.JFrame {

    DefaultListModel model;
    int n = Integer.parseInt(JOptionPane.showInputDialog("Enter how many numbers you want to generate."));
    int nums[] = new int[n];
    
    public Sorting() {
        initComponents();
        model = new DefaultListModel();
        lstnums.setModel(model);//connect model to list
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstnums = new javax.swing.JList();
        btngen = new javax.swing.JButton();
        btnbub = new javax.swing.JButton();
        btnsel = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstnums);

        btngen.setText("Generate");
        btngen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenActionPerformed(evt);
            }
        });

        btnbub.setText("Bubble");
        btnbub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubActionPerformed(evt);
            }
        });

        btnsel.setText("Selection");
        btnsel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselActionPerformed(evt);
            }
        });

        btninsert.setText("Insertion");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        jLabel1.setText("Sorting Methods");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btngen)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnsel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnbub)
                        .addGap(31, 31, 31)
                        .addComponent(btnsel)
                        .addGap(30, 30, 30)
                        .addComponent(btninsert)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btngen)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btngenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenActionPerformed
        model.clear();
        for(int x=0; x<nums.length; x++){
            nums[x] = (int)(Math.random()*100000)+1;
            model.addElement(nums[x]);
        }
        JOptionPane.showMessageDialog(this,"Factorial " + n + " = " + factorial(n));
    }//GEN-LAST:event_btngenActionPerformed
    public static void bubbleSort(int[] a){
   	int k = 0;
   	boolean exchangeMade = true;
	// Make up to n - 1 passes through array, exit 
	//early if no exchanges are made on previous pass
  
 	while ((k < a.length - 1) && exchangeMade){
      		exchangeMade = false;
      		k++;
      		for (int j = 0; j < a.length - k; j++)  
         		if (a[j] > a[j + 1]){
            			swap(a, j, j + 1);		 
            			exchangeMade = true;
         		}//end if
		}//end for
	}//end while
    //supporting swap method
    
    public static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void selectionSort(int[] a){
        for (int i = 0; i < a.length - 1; i++){
            int minIndex = findMinimum(a, i);
            if (minIndex != i)
                //if lowest is not already in place
                swap(a, i, minIndex);
        } //end for
    }  

    public static int findMinimum(int[] a, int first){
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first; 
        for (int i = first + 1; i < a.length; i++)
            if (a[i] < a[minIndex])
                minIndex = i;
        return minIndex;
    }
    public static void insertionSort(int a[]){
	int itemToInsert, j;
	boolean stillLooking;

	//on the kth pass, pass item k upwards in list
	//and insert it in its proper place amoung the
	//first k entries in an array

	for (int k=1; k<a.length; k++){
	//move backwards through list, looking for
	//the right place to insert a[k];
		itemToInsert = a[k];
		j=k-1;
		stillLooking=true;
		while(j >=0 && stillLooking){
			if (itemToInsert < a[j]){
				//move item higher
				a[j+1] = a[j];
				j--;
			}else{
				//we have found new home for a[k];
				stillLooking=false;
			}//end else// j+1 is where the item goes
			a[j+1]=itemToInsert;
		}//end while
  	}//end for
    }//end method
    
    ////////////////////// Added Recursion Factorial Sort////////////////////////
    static int factorial(int n){
            if (n == 1)
                return 1;
            else
                return n*factorial(n - 1);
        }
    
    
    
    private void btnbubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubActionPerformed
        model.clear();
        double stime = System.currentTimeMillis();
        bubbleSort(nums);
        double etime = System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it took to sort: " + etime/1000 + " Seconds");
        for (int x=0; x<nums.length; x++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btnbubActionPerformed

    private void btnselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselActionPerformed
        model.clear();
        double stime = System.currentTimeMillis();
        selectionSort(nums);
        double etime = System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it took to sort: " + etime/1000 + " Seconds");
        for (int x=0; x<nums.length; x++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btnselActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        model.clear();
        double stime = System.currentTimeMillis();
        insertionSort(nums);
        double etime = System.currentTimeMillis()-stime;
        JOptionPane.showMessageDialog(this, "Time it took to sort: " + etime/1000 + " Seconds");
        for (int x=0; x<nums.length; x++){
            model.addElement(nums[x]);
        }
    }//GEN-LAST:event_btninsertActionPerformed

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbub;
    private javax.swing.JButton btngen;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnsel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstnums;
    // End of variables declaration//GEN-END:variables
}

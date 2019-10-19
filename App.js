import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  StatusBar,
  Button,
  Alert,
} from 'react-native';

const App: () => React$Node = () => {
  return (
    <>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView>
        <ScrollView
          contentInsetAdjustmentBehavior="automatic"
          style={styles.scrollView}>
          <View style={styles.body}>
            <View style={styles.sectionContainer}>
              <Text style={styles.sectionTitle}>Olá Nuno!</Text>
              <Text style={styles.sectionDescription}>
                <Text style={styles.normal}></Text>
              </Text>
              <Button
                style={styles.buttonOpen}
                title="Abrir"
                onPress={() => Alert.alert('Espere um momento')}
              />
            </View>
          </View>
        </ScrollView>
      </SafeAreaView>
    </>
  );
};

const styles = StyleSheet.create({
  scrollView: {
    backgroundColor: '#fff',
  },
  engine: {
    position: 'absolute',
    right: 0,
  },
  body: {
    backgroundColor: '#fff',
  },
  sectionContainer: {
    marginTop: 80,
    paddingHorizontal: 24,
  },
  sectionTitle: {
    fontSize: 45,
    fontWeight: '600',
    color: '#000',
    textAlign: 'center',
  },
  sectionDescription: {
    marginTop: 8,
    fontSize: 18,
    fontWeight: '400',
    color: '#000',
  },
  normal: {
    fontWeight: '400',
    fontSize: 16,
  },
  footer: {
    color: '#000',
    fontSize: 12,
    fontWeight: '600',
    padding: 4,
    paddingRight: 12,
    textAlign: 'right',
  },
  buttonOpen: {
    width:'100%',
    height:40,
    backgroundColor:'#00bfff', 
    color: "#f8f8ff",
    alignItems:'center',
    justifyContent:'center',
  }
});

export default App;

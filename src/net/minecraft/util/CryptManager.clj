(ns net.minecraft.util.CryptManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util CryptManager]))

(defn ->crypt-manager
  "Constructor."
  (^CryptManager []
    (new CryptManager )))

(defn *create-new-shared-key
  "returns: `javax.crypto.SecretKey`"
  (^javax.crypto.SecretKey []
    (CryptManager/createNewSharedKey )))

(defn *generate-key-pair
  "returns: `java.security.KeyPair`"
  (^java.security.KeyPair []
    (CryptManager/generateKeyPair )))

(defn *get-server-id-hash
  "server-id - `java.lang.String`
  public-key - `java.security.PublicKey`
  secret-key - `javax.crypto.SecretKey`

  returns: `byte[]`"
  ([^java.lang.String server-id ^java.security.PublicKey public-key ^javax.crypto.SecretKey secret-key]
    (CryptManager/getServerIdHash server-id public-key secret-key)))

(defn *decode-public-key
  "encoded-key - `byte[]`

  returns: `java.security.PublicKey`"
  (^java.security.PublicKey [encoded-key]
    (CryptManager/decodePublicKey encoded-key)))

(defn *decrypt-shared-key
  "key - `java.security.PrivateKey`
  secret-key-encrypted - `byte[]`

  returns: `javax.crypto.SecretKey`"
  (^javax.crypto.SecretKey [^java.security.PrivateKey key secret-key-encrypted]
    (CryptManager/decryptSharedKey key secret-key-encrypted)))

(defn *encrypt-data
  "key - `java.security.Key`
  data - `byte[]`

  returns: `byte[]`"
  ([^java.security.Key key data]
    (CryptManager/encryptData key data)))

(defn *decrypt-data
  "key - `java.security.Key`
  data - `byte[]`

  returns: `byte[]`"
  ([^java.security.Key key data]
    (CryptManager/decryptData key data)))

(defn *create-net-cipher-instance
  "op-mode - `int`
  key - `java.security.Key`

  returns: `javax.crypto.Cipher`"
  (^javax.crypto.Cipher [^Integer op-mode ^java.security.Key key]
    (CryptManager/createNetCipherInstance op-mode key)))


(ns net.minecraftforge.fml.common.MinecraftDummyContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common MinecraftDummyContainer]))

(defn ->minecraft-dummy-container
  "Constructor.

  actual-mc-version - `java.lang.String`"
  (^MinecraftDummyContainer [^java.lang.String actual-mc-version]
    (new MinecraftDummyContainer actual-mc-version)))

(defn immutable?
  "returns: `boolean`"
  (^Boolean [^MinecraftDummyContainer this]
    (-> this (.isImmutable))))

(defn get-source
  "Description copied from interface: ModContainer

  returns: `java.io.File`"
  (^java.io.File [^MinecraftDummyContainer this]
    (-> this (.getSource))))

(defn register-bus
  "Description copied from interface: ModContainer

  bus - `com.google.common.eventbus.EventBus`
  controller - `net.minecraftforge.fml.common.LoadController`

  returns: `boolean`"
  (^Boolean [^MinecraftDummyContainer this ^com.google.common.eventbus.EventBus bus ^net.minecraftforge.fml.common.LoadController controller]
    (-> this (.registerBus bus controller))))

(defn get-static-version-range
  "returns: `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^MinecraftDummyContainer this]
    (-> this (.getStaticVersionRange))))

(defn get-signing-certificate
  "returns: `java.security.cert.Certificate`"
  (^java.security.cert.Certificate [^MinecraftDummyContainer this]
    (-> this (.getSigningCertificate))))


(ns net.minecraftforge.fml.common.DummyModContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common DummyModContainer]))

(defn ->dummy-mod-container
  "Constructor.

  md - `net.minecraftforge.fml.common.ModMetadata`"
  (^DummyModContainer [^net.minecraftforge.fml.common.ModMetadata md]
    (new DummyModContainer md))
  (^DummyModContainer []
    (new DummyModContainer )))

(defn bind-metadata
  "Description copied from interface: ModContainer

  mc - `net.minecraftforge.fml.common.MetadataCollection`"
  ([^DummyModContainer this ^net.minecraftforge.fml.common.MetadataCollection mc]
    (-> this (.bindMetadata mc))))

(defn get-signing-certificate
  "returns: `java.security.cert.Certificate`"
  (^java.security.cert.Certificate [^DummyModContainer this]
    (-> this (.getSigningCertificate))))

(defn get-update-url
  "returns: `java.net.URL`"
  (^java.net.URL [^DummyModContainer this]
    (-> this (.getUpdateUrl))))

(defn get-mod
  "Description copied from interface: ModContainer

  returns: `java.lang.Object`"
  (^java.lang.Object [^DummyModContainer this]
    (-> this (.getMod))))

(defn get-shared-mod-descriptor
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^DummyModContainer this]
    (-> this (.getSharedModDescriptor))))

(defn get-dependencies
  "Description copied from interface: ModContainer

  returns: `java.util.List<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.List [^DummyModContainer this]
    (-> this (.getDependencies))))

(defn get-processed-version
  "returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^DummyModContainer this]
    (-> this (.getProcessedVersion))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DummyModContainer this]
    (-> this (.toString))))

(defn set-enabled-state
  "Description copied from interface: ModContainer

  enabled - `boolean`"
  ([^DummyModContainer this ^Boolean enabled]
    (-> this (.setEnabledState enabled))))

(defn set-class-version
  "class-version - `int`"
  ([^DummyModContainer this ^Integer class-version]
    (-> this (.setClassVersion class-version))))

(defn get-name
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^DummyModContainer this]
    (-> this (.getName))))

(defn get-sorting-rules
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^DummyModContainer this]
    (-> this (.getSortingRules))))

(defn get-class-version
  "returns: `int`"
  (^Integer [^DummyModContainer this]
    (-> this (.getClassVersion))))

(defn get-gui-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^DummyModContainer this]
    (-> this (.getGuiClassName))))

(defn get-source
  "Description copied from interface: ModContainer

  returns: `java.io.File`"
  (^java.io.File [^DummyModContainer this]
    (-> this (.getSource))))

(defn get-version
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^DummyModContainer this]
    (-> this (.getVersion))))

(defn get-custom-resource-pack-class
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^DummyModContainer this]
    (-> this (.getCustomResourcePackClass))))

(defn should-load-in-environment?
  "returns: `boolean`"
  (^Boolean [^DummyModContainer this]
    (-> this (.shouldLoadInEnvironment))))

(defn acceptable-minecraft-version-range
  "returns: `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^DummyModContainer this]
    (-> this (.acceptableMinecraftVersionRange))))

(defn register-bus
  "Description copied from interface: ModContainer

  bus - `com.google.common.eventbus.EventBus`
  controller - `net.minecraftforge.fml.common.LoadController`

  returns: `boolean`"
  (^Boolean [^DummyModContainer this ^com.google.common.eventbus.EventBus bus ^net.minecraftforge.fml.common.LoadController controller]
    (-> this (.registerBus bus controller))))

(defn get-dependants
  "Description copied from interface: ModContainer

  returns: `java.util.List<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.List [^DummyModContainer this]
    (-> this (.getDependants))))

(defn matches
  "Description copied from interface: ModContainer

  mod - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DummyModContainer this ^java.lang.Object mod]
    (-> this (.matches mod))))

(defn get-mod-id
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^DummyModContainer this]
    (-> this (.getModId))))

(defn get-custom-mod-properties
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^DummyModContainer this]
    (-> this (.getCustomModProperties))))

(defn get-display-version
  "returns: `java.lang.String`"
  (^java.lang.String [^DummyModContainer this]
    (-> this (.getDisplayVersion))))

(defn get-requirements
  "Description copied from interface: ModContainer

  returns: `java.util.Set<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.Set [^DummyModContainer this]
    (-> this (.getRequirements))))

(defn get-metadata
  "Description copied from interface: ModContainer

  returns: `net.minecraftforge.fml.common.ModMetadata`"
  (^net.minecraftforge.fml.common.ModMetadata [^DummyModContainer this]
    (-> this (.getMetadata))))

(defn can-be-disabled
  "returns: `net.minecraftforge.fml.common.ModContainer$Disableable`"
  (^net.minecraftforge.fml.common.ModContainer$Disableable [^DummyModContainer this]
    (-> this (.canBeDisabled))))

(defn get-owned-packages
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DummyModContainer this]
    (-> this (.getOwnedPackages))))

(defn immutable?
  "returns: `boolean`"
  (^Boolean [^DummyModContainer this]
    (-> this (.isImmutable))))


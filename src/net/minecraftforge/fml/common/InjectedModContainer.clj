(ns net.minecraftforge.fml.common.InjectedModContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common InjectedModContainer]))

(defn ->injected-mod-container
  "Constructor.

  mc - `net.minecraftforge.fml.common.ModContainer`
  source - `java.io.File`"
  (^InjectedModContainer [^net.minecraftforge.fml.common.ModContainer mc ^java.io.File source]
    (new InjectedModContainer mc source)))

(defn wrapped-container
  "Instance Constant.

  type: net.minecraftforge.fml.common.ModContainer"
  (^net.minecraftforge.fml.common.ModContainer [^InjectedModContainer this]
    (-> this .-wrappedContainer)))

(defn bind-metadata
  "Description copied from interface: ModContainer

  mc - `net.minecraftforge.fml.common.MetadataCollection`"
  ([^InjectedModContainer this ^net.minecraftforge.fml.common.MetadataCollection mc]
    (-> this (.bindMetadata mc))))

(defn get-signing-certificate
  "returns: `java.security.cert.Certificate`"
  (^java.security.cert.Certificate [^InjectedModContainer this]
    (-> this (.getSigningCertificate))))

(defn get-update-url
  "returns: `java.net.URL`"
  (^java.net.URL [^InjectedModContainer this]
    (-> this (.getUpdateUrl))))

(defn get-mod
  "Description copied from interface: ModContainer

  returns: `java.lang.Object`"
  (^java.lang.Object [^InjectedModContainer this]
    (-> this (.getMod))))

(defn get-shared-mod-descriptor
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^InjectedModContainer this]
    (-> this (.getSharedModDescriptor))))

(defn get-dependencies
  "Description copied from interface: ModContainer

  returns: `java.util.List<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.List [^InjectedModContainer this]
    (-> this (.getDependencies))))

(defn get-processed-version
  "returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^InjectedModContainer this]
    (-> this (.getProcessedVersion))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InjectedModContainer this]
    (-> this (.toString))))

(defn set-enabled-state
  "Description copied from interface: ModContainer

  enabled - `boolean`"
  ([^InjectedModContainer this ^Boolean enabled]
    (-> this (.setEnabledState enabled))))

(defn set-class-version
  "class-version - `int`"
  ([^InjectedModContainer this ^Integer class-version]
    (-> this (.setClassVersion class-version))))

(defn get-name
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^InjectedModContainer this]
    (-> this (.getName))))

(defn get-sorting-rules
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^InjectedModContainer this]
    (-> this (.getSortingRules))))

(defn get-class-version
  "returns: `int`"
  (^Integer [^InjectedModContainer this]
    (-> this (.getClassVersion))))

(defn get-gui-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^InjectedModContainer this]
    (-> this (.getGuiClassName))))

(defn get-source
  "Description copied from interface: ModContainer

  returns: `java.io.File`"
  (^java.io.File [^InjectedModContainer this]
    (-> this (.getSource))))

(defn get-version
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^InjectedModContainer this]
    (-> this (.getVersion))))

(defn get-custom-resource-pack-class
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^InjectedModContainer this]
    (-> this (.getCustomResourcePackClass))))

(defn get-wrapped-world-access-container
  "returns: `net.minecraftforge.fml.common.WorldAccessContainer`"
  (^net.minecraftforge.fml.common.WorldAccessContainer [^InjectedModContainer this]
    (-> this (.getWrappedWorldAccessContainer))))

(defn should-load-in-environment?
  "returns: `boolean`"
  (^Boolean [^InjectedModContainer this]
    (-> this (.shouldLoadInEnvironment))))

(defn acceptable-minecraft-version-range
  "returns: `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^InjectedModContainer this]
    (-> this (.acceptableMinecraftVersionRange))))

(defn register-bus
  "Description copied from interface: ModContainer

  bus - `com.google.common.eventbus.EventBus`
  controller - `net.minecraftforge.fml.common.LoadController`

  returns: `boolean`"
  (^Boolean [^InjectedModContainer this ^com.google.common.eventbus.EventBus bus ^net.minecraftforge.fml.common.LoadController controller]
    (-> this (.registerBus bus controller))))

(defn get-dependants
  "Description copied from interface: ModContainer

  returns: `java.util.List<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.List [^InjectedModContainer this]
    (-> this (.getDependants))))

(defn matches
  "Description copied from interface: ModContainer

  mod - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InjectedModContainer this ^java.lang.Object mod]
    (-> this (.matches mod))))

(defn get-mod-id
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^InjectedModContainer this]
    (-> this (.getModId))))

(defn get-custom-mod-properties
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^InjectedModContainer this]
    (-> this (.getCustomModProperties))))

(defn get-display-version
  "returns: `java.lang.String`"
  (^java.lang.String [^InjectedModContainer this]
    (-> this (.getDisplayVersion))))

(defn get-requirements
  "Description copied from interface: ModContainer

  returns: `java.util.Set<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.Set [^InjectedModContainer this]
    (-> this (.getRequirements))))

(defn get-metadata
  "Description copied from interface: ModContainer

  returns: `net.minecraftforge.fml.common.ModMetadata`"
  (^net.minecraftforge.fml.common.ModMetadata [^InjectedModContainer this]
    (-> this (.getMetadata))))

(defn can-be-disabled
  "returns: `net.minecraftforge.fml.common.ModContainer$Disableable`"
  (^net.minecraftforge.fml.common.ModContainer$Disableable [^InjectedModContainer this]
    (-> this (.canBeDisabled))))

(defn get-owned-packages
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InjectedModContainer this]
    (-> this (.getOwnedPackages))))

(defn immutable?
  "returns: `boolean`"
  (^Boolean [^InjectedModContainer this]
    (-> this (.isImmutable))))


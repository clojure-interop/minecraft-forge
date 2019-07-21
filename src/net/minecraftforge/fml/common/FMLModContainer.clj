(ns net.minecraftforge.fml.common.FMLModContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common FMLModContainer]))

(defn ->fml-mod-container
  "Constructor.

  class-name - `java.lang.String`
  container - `net.minecraftforge.fml.common.discovery.ModCandidate`
  mod-descriptor - `java.util.Map`"
  (^FMLModContainer [^java.lang.String class-name ^net.minecraftforge.fml.common.discovery.ModCandidate container ^java.util.Map mod-descriptor]
    (new FMLModContainer class-name container mod-descriptor)))

(defn bind-metadata
  "Description copied from interface: ModContainer

  mc - `net.minecraftforge.fml.common.MetadataCollection`"
  ([^FMLModContainer this ^net.minecraftforge.fml.common.MetadataCollection mc]
    (-> this (.bindMetadata mc))))

(defn get-signing-certificate
  "returns: `java.security.cert.Certificate`"
  (^java.security.cert.Certificate [^FMLModContainer this]
    (-> this (.getSigningCertificate))))

(defn get-update-url
  "returns: `java.net.URL`"
  (^java.net.URL [^FMLModContainer this]
    (-> this (.getUpdateUrl))))

(defn get-mod
  "Description copied from interface: ModContainer

  returns: `java.lang.Object`"
  (^java.lang.Object [^FMLModContainer this]
    (-> this (.getMod))))

(defn search-for-version-properties
  "returns: `java.util.Properties`"
  (^java.util.Properties [^FMLModContainer this]
    (-> this (.searchForVersionProperties))))

(defn get-shared-mod-descriptor
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FMLModContainer this]
    (-> this (.getSharedModDescriptor))))

(defn get-dependencies
  "Description copied from interface: ModContainer

  returns: `java.util.List<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.List [^FMLModContainer this]
    (-> this (.getDependencies))))

(defn get-processed-version
  "returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^FMLModContainer this]
    (-> this (.getProcessedVersion))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLModContainer this]
    (-> this (.toString))))

(defn set-enabled-state
  "Description copied from interface: ModContainer

  enabled - `boolean`"
  ([^FMLModContainer this ^Boolean enabled]
    (-> this (.setEnabledState enabled))))

(defn construct-mod
  "event - `net.minecraftforge.fml.common.event.FMLConstructionEvent`"
  ([^FMLModContainer this ^net.minecraftforge.fml.common.event.FMLConstructionEvent event]
    (-> this (.constructMod event))))

(defn set-class-version
  "class-version - `int`"
  ([^FMLModContainer this ^Integer class-version]
    (-> this (.setClassVersion class-version))))

(defn get-name
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^FMLModContainer this]
    (-> this (.getName))))

(defn get-sorting-rules
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^FMLModContainer this]
    (-> this (.getSortingRules))))

(defn get-class-version
  "returns: `int`"
  (^Integer [^FMLModContainer this]
    (-> this (.getClassVersion))))

(defn get-gui-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLModContainer this]
    (-> this (.getGuiClassName))))

(defn get-source
  "Description copied from interface: ModContainer

  returns: `java.io.File`"
  (^java.io.File [^FMLModContainer this]
    (-> this (.getSource))))

(defn get-version
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^FMLModContainer this]
    (-> this (.getVersion))))

(defn get-custom-resource-pack-class
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^FMLModContainer this]
    (-> this (.getCustomResourcePackClass))))

(defn should-load-in-environment?
  "returns: `boolean`"
  (^Boolean [^FMLModContainer this]
    (-> this (.shouldLoadInEnvironment))))

(defn acceptable-minecraft-version-range
  "returns: `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^FMLModContainer this]
    (-> this (.acceptableMinecraftVersionRange))))

(defn register-bus
  "Description copied from interface: ModContainer

  bus - `com.google.common.eventbus.EventBus`
  controller - `net.minecraftforge.fml.common.LoadController`

  returns: `boolean`"
  (^Boolean [^FMLModContainer this ^com.google.common.eventbus.EventBus bus ^net.minecraftforge.fml.common.LoadController controller]
    (-> this (.registerBus bus controller))))

(defn handle-mod-state-event
  "event - `net.minecraftforge.fml.common.event.FMLEvent`"
  ([^FMLModContainer this ^net.minecraftforge.fml.common.event.FMLEvent event]
    (-> this (.handleModStateEvent event))))

(defn get-dependants
  "Description copied from interface: ModContainer

  returns: `java.util.List<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.List [^FMLModContainer this]
    (-> this (.getDependants))))

(defn matches
  "Description copied from interface: ModContainer

  mod - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FMLModContainer this ^java.lang.Object mod]
    (-> this (.matches mod))))

(defn get-mod-id
  "Description copied from interface: ModContainer

  returns: `java.lang.String`"
  (^java.lang.String [^FMLModContainer this]
    (-> this (.getModId))))

(defn get-custom-mod-properties
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FMLModContainer this]
    (-> this (.getCustomModProperties))))

(defn get-display-version
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLModContainer this]
    (-> this (.getDisplayVersion))))

(defn get-requirements
  "Description copied from interface: ModContainer

  returns: `java.util.Set<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.Set [^FMLModContainer this]
    (-> this (.getRequirements))))

(defn get-metadata
  "Description copied from interface: ModContainer

  returns: `net.minecraftforge.fml.common.ModMetadata`"
  (^net.minecraftforge.fml.common.ModMetadata [^FMLModContainer this]
    (-> this (.getMetadata))))

(defn can-be-disabled
  "returns: `net.minecraftforge.fml.common.ModContainer$Disableable`"
  (^net.minecraftforge.fml.common.ModContainer$Disableable [^FMLModContainer this]
    (-> this (.canBeDisabled))))

(defn get-owned-packages
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^FMLModContainer this]
    (-> this (.getOwnedPackages))))

(defn immutable?
  "returns: `boolean`"
  (^Boolean [^FMLModContainer this]
    (-> this (.isImmutable))))


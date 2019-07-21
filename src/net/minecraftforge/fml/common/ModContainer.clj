(ns net.minecraftforge.fml.common.ModContainer
  "The container that wraps around mods in the system.

  The philosophy is that individual mod implementation technologies should not
  impact the actual loading and management of mod code. This interface provides
  a mechanism by which we can wrap actual mod code so that the loader and other
  facilities can treat mods at arms length."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ModContainer]))

(defn bind-metadata
  "Attach this mod to it's metadata from the supplied metadata collection

  mc - `net.minecraftforge.fml.common.MetadataCollection`"
  ([^ModContainer this ^net.minecraftforge.fml.common.MetadataCollection mc]
    (-> this (.bindMetadata mc))))

(defn get-signing-certificate
  "returns: `java.security.cert.Certificate`"
  (^java.security.cert.Certificate [^ModContainer this]
    (-> this (.getSigningCertificate))))

(defn get-update-url
  "returns: `java.net.URL`"
  (^java.net.URL [^ModContainer this]
    (-> this (.getUpdateUrl))))

(defn get-mod
  "Get the actual mod object

  returns: `java.lang.Object`"
  (^java.lang.Object [^ModContainer this]
    (-> this (.getMod))))

(defn get-shared-mod-descriptor
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ModContainer this]
    (-> this (.getSharedModDescriptor))))

(defn get-dependencies
  "A list of modids that should be loaded prior to this one. The special
   value * indicates to load after any other mod.

  returns: `java.util.List<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.List [^ModContainer this]
    (-> this (.getDependencies))))

(defn get-processed-version
  "returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^ModContainer this]
    (-> this (.getProcessedVersion))))

(defn set-enabled-state
  "Set the enabled/disabled state of this mod

  enabled - `boolean`"
  ([^ModContainer this ^Boolean enabled]
    (-> this (.setEnabledState enabled))))

(defn set-class-version
  "class-version - `int`"
  ([^ModContainer this ^Integer class-version]
    (-> this (.setClassVersion class-version))))

(defn get-name
  "A human readable name

  returns: `java.lang.String`"
  (^java.lang.String [^ModContainer this]
    (-> this (.getName))))

(defn get-sorting-rules
  "A representative string encapsulating the sorting preferences for this
   mod

  returns: `java.lang.String`"
  (^java.lang.String [^ModContainer this]
    (-> this (.getSortingRules))))

(defn get-class-version
  "returns: `int`"
  (^Integer [^ModContainer this]
    (-> this (.getClassVersion))))

(defn get-gui-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ModContainer this]
    (-> this (.getGuiClassName))))

(defn get-source
  "The location on the file system which this mod came from

  returns: `java.io.File`"
  (^java.io.File [^ModContainer this]
    (-> this (.getSource))))

(defn get-version
  "A human readable version identifier

  returns: `java.lang.String`"
  (^java.lang.String [^ModContainer this]
    (-> this (.getVersion))))

(defn get-custom-resource-pack-class
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^ModContainer this]
    (-> this (.getCustomResourcePackClass))))

(defn should-load-in-environment?
  "returns: `boolean`"
  (^Boolean [^ModContainer this]
    (-> this (.shouldLoadInEnvironment))))

(defn acceptable-minecraft-version-range
  "returns: `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^ModContainer this]
    (-> this (.acceptableMinecraftVersionRange))))

(defn register-bus
  "Register the event bus for the mod and the controller for error handling
   Returns if this bus was successfully registered - disabled mods and other
   mods that don't need real events should return false and avoid further
   processing

  bus - `com.google.common.eventbus.EventBus`
  controller - `net.minecraftforge.fml.common.LoadController`

  returns: `boolean`"
  (^Boolean [^ModContainer this ^com.google.common.eventbus.EventBus bus ^net.minecraftforge.fml.common.LoadController controller]
    (-> this (.registerBus bus controller))))

(defn get-dependants
  "A list of modids that should be loaded after this one. The
   special value * indicates to load before any
   other mod.

  returns: `java.util.List<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.List [^ModContainer this]
    (-> this (.getDependants))))

(defn matches
  "Does this mod match the supplied mod

  mod - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ModContainer this ^java.lang.Object mod]
    (-> this (.matches mod))))

(defn get-mod-id
  "The globally unique modid for this mod

  returns: `java.lang.String`"
  (^java.lang.String [^ModContainer this]
    (-> this (.getModId))))

(defn get-custom-mod-properties
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ModContainer this]
    (-> this (.getCustomModProperties))))

(defn get-display-version
  "returns: `java.lang.String`"
  (^java.lang.String [^ModContainer this]
    (-> this (.getDisplayVersion))))

(defn get-requirements
  "A list of the modids that this mod requires loaded prior to loading

  returns: `java.util.Set<net.minecraftforge.fml.common.versioning.ArtifactVersion>`"
  (^java.util.Set [^ModContainer this]
    (-> this (.getRequirements))))

(defn get-metadata
  "The metadata for this mod

  returns: `net.minecraftforge.fml.common.ModMetadata`"
  (^net.minecraftforge.fml.common.ModMetadata [^ModContainer this]
    (-> this (.getMetadata))))

(defn can-be-disabled
  "returns: `net.minecraftforge.fml.common.ModContainer$Disableable`"
  (^net.minecraftforge.fml.common.ModContainer$Disableable [^ModContainer this]
    (-> this (.canBeDisabled))))

(defn get-owned-packages
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ModContainer this]
    (-> this (.getOwnedPackages))))

(defn immutable?
  "returns: `boolean`"
  (^Boolean [^ModContainer this]
    (-> this (.isImmutable))))


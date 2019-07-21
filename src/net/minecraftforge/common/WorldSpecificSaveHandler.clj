(ns net.minecraftforge.common.WorldSpecificSaveHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common WorldSpecificSaveHandler]))

(defn ->world-specific-save-handler
  "Constructor.

  world - `net.minecraft.world.WorldServer`
  parent - `net.minecraft.world.storage.ISaveHandler`"
  (^WorldSpecificSaveHandler [^net.minecraft.world.WorldServer world ^net.minecraft.world.storage.ISaveHandler parent]
    (new WorldSpecificSaveHandler world parent)))

(defn get-map-file-from-name
  "name - `java.lang.String`

  returns: `java.io.File`"
  (^java.io.File [^WorldSpecificSaveHandler this ^java.lang.String name]
    (-> this (.getMapFileFromName name))))

(defn save-world-info
  "var-1 - `net.minecraft.world.storage.WorldInfo`"
  ([^WorldSpecificSaveHandler this ^net.minecraft.world.storage.WorldInfo var-1]
    (-> this (.saveWorldInfo var-1))))

(defn flush
  ""
  ([^WorldSpecificSaveHandler this]
    (-> this (.flush))))

(defn get-chunk-loader
  "var-1 - `net.minecraft.world.WorldProvider`

  returns: `net.minecraft.world.chunk.storage.IChunkLoader`"
  (^net.minecraft.world.chunk.storage.IChunkLoader [^WorldSpecificSaveHandler this ^net.minecraft.world.WorldProvider var-1]
    (-> this (.getChunkLoader var-1))))

(defn save-world-info-with-player
  "var-1 - `net.minecraft.world.storage.WorldInfo`
  var-2 - `net.minecraft.nbt.NBTTagCompound`"
  ([^WorldSpecificSaveHandler this ^net.minecraft.world.storage.WorldInfo var-1 ^net.minecraft.nbt.NBTTagCompound var-2]
    (-> this (.saveWorldInfoWithPlayer var-1 var-2))))

(defn get-world-directory
  "returns: `java.io.File`"
  (^java.io.File [^WorldSpecificSaveHandler this]
    (-> this (.getWorldDirectory))))

(defn load-world-info
  "returns: `net.minecraft.world.storage.WorldInfo`"
  (^net.minecraft.world.storage.WorldInfo [^WorldSpecificSaveHandler this]
    (-> this (.loadWorldInfo))))

(defn check-session-lock
  "throws: net.minecraft.world.MinecraftException"
  ([^WorldSpecificSaveHandler this]
    (-> this (.checkSessionLock))))

(defn get-structure-template-manager
  "returns: `net.minecraft.world.gen.structure.template.TemplateManager`"
  (^net.minecraft.world.gen.structure.template.TemplateManager [^WorldSpecificSaveHandler this]
    (-> this (.getStructureTemplateManager))))

(defn get-player-nbt-manager
  "returns: `net.minecraft.world.storage.IPlayerFileData`"
  (^net.minecraft.world.storage.IPlayerFileData [^WorldSpecificSaveHandler this]
    (-> this (.getPlayerNBTManager))))


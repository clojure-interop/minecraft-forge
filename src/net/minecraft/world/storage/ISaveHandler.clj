(ns net.minecraft.world.storage.ISaveHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage ISaveHandler]))

(defn get-map-file-from-name
  "map-name - `java.lang.String`

  returns: `java.io.File`"
  (^java.io.File [^ISaveHandler this ^java.lang.String map-name]
    (-> this (.getMapFileFromName map-name))))

(defn save-world-info
  "world-information - `net.minecraft.world.storage.WorldInfo`"
  ([^ISaveHandler this ^net.minecraft.world.storage.WorldInfo world-information]
    (-> this (.saveWorldInfo world-information))))

(defn flush
  ""
  ([^ISaveHandler this]
    (-> this (.flush))))

(defn get-chunk-loader
  "provider - `net.minecraft.world.WorldProvider`

  returns: `net.minecraft.world.chunk.storage.IChunkLoader`"
  (^net.minecraft.world.chunk.storage.IChunkLoader [^ISaveHandler this ^net.minecraft.world.WorldProvider provider]
    (-> this (.getChunkLoader provider))))

(defn save-world-info-with-player
  "world-information - `net.minecraft.world.storage.WorldInfo`
  tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^ISaveHandler this ^net.minecraft.world.storage.WorldInfo world-information ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.saveWorldInfoWithPlayer world-information tag-compound))))

(defn get-world-directory
  "returns: `java.io.File`"
  (^java.io.File [^ISaveHandler this]
    (-> this (.getWorldDirectory))))

(defn load-world-info
  "returns: `net.minecraft.world.storage.WorldInfo`"
  (^net.minecraft.world.storage.WorldInfo [^ISaveHandler this]
    (-> this (.loadWorldInfo))))

(defn check-session-lock
  "throws: net.minecraft.world.MinecraftException"
  ([^ISaveHandler this]
    (-> this (.checkSessionLock))))

(defn get-structure-template-manager
  "returns: `net.minecraft.world.gen.structure.template.TemplateManager`"
  (^net.minecraft.world.gen.structure.template.TemplateManager [^ISaveHandler this]
    (-> this (.getStructureTemplateManager))))

(defn get-player-nbt-manager
  "returns: `net.minecraft.world.storage.IPlayerFileData`"
  (^net.minecraft.world.storage.IPlayerFileData [^ISaveHandler this]
    (-> this (.getPlayerNBTManager))))


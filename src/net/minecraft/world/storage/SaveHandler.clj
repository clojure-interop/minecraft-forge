(ns net.minecraft.world.storage.SaveHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage SaveHandler]))

(defn ->save-handler
  "Constructor.

  p-i-46648-1 - `java.io.File`
  save-directory-name-in - `java.lang.String`
  p-i-46648-3 - `boolean`
  data-fixer-in - `net.minecraft.util.datafix.DataFixer`"
  (^SaveHandler [^java.io.File p-i-46648-1 ^java.lang.String save-directory-name-in ^Boolean p-i-46648-3 ^net.minecraft.util.datafix.DataFixer data-fixer-in]
    (new SaveHandler p-i-46648-1 save-directory-name-in p-i-46648-3 data-fixer-in)))

(defn get-available-player-dat
  "returns: `java.lang.String[]`"
  ([^SaveHandler this]
    (-> this (.getAvailablePlayerDat))))

(defn get-map-file-from-name
  "map-name - `java.lang.String`

  returns: `java.io.File`"
  (^java.io.File [^SaveHandler this ^java.lang.String map-name]
    (-> this (.getMapFileFromName map-name))))

(defn save-world-info
  "world-information - `net.minecraft.world.storage.WorldInfo`"
  ([^SaveHandler this ^net.minecraft.world.storage.WorldInfo world-information]
    (-> this (.saveWorldInfo world-information))))

(defn read-player-data
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^SaveHandler this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.readPlayerData player))))

(defn flush
  ""
  ([^SaveHandler this]
    (-> this (.flush))))

(defn get-chunk-loader
  "provider - `net.minecraft.world.WorldProvider`

  returns: `net.minecraft.world.chunk.storage.IChunkLoader`"
  (^net.minecraft.world.chunk.storage.IChunkLoader [^SaveHandler this ^net.minecraft.world.WorldProvider provider]
    (-> this (.getChunkLoader provider))))

(defn save-world-info-with-player
  "world-information - `net.minecraft.world.storage.WorldInfo`
  tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^SaveHandler this ^net.minecraft.world.storage.WorldInfo world-information ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.saveWorldInfoWithPlayer world-information tag-compound))))

(defn get-world-directory
  "returns: `java.io.File`"
  (^java.io.File [^SaveHandler this]
    (-> this (.getWorldDirectory))))

(defn load-world-info
  "returns: `net.minecraft.world.storage.WorldInfo`"
  (^net.minecraft.world.storage.WorldInfo [^SaveHandler this]
    (-> this (.loadWorldInfo))))

(defn get-player-nbt
  "player - `net.minecraft.entity.player.EntityPlayerMP`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^SaveHandler this ^net.minecraft.entity.player.EntityPlayerMP player]
    (-> this (.getPlayerNBT player))))

(defn check-session-lock
  "throws: net.minecraft.world.MinecraftException"
  ([^SaveHandler this]
    (-> this (.checkSessionLock))))

(defn get-structure-template-manager
  "returns: `net.minecraft.world.gen.structure.template.TemplateManager`"
  (^net.minecraft.world.gen.structure.template.TemplateManager [^SaveHandler this]
    (-> this (.getStructureTemplateManager))))

(defn get-player-nbt-manager
  "returns: `net.minecraft.world.storage.IPlayerFileData`"
  (^net.minecraft.world.storage.IPlayerFileData [^SaveHandler this]
    (-> this (.getPlayerNBTManager))))

(defn write-player-data
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^SaveHandler this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.writePlayerData player))))


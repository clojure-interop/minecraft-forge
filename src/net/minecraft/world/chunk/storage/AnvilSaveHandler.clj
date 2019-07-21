(ns net.minecraft.world.chunk.storage.AnvilSaveHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.chunk.storage AnvilSaveHandler]))

(defn ->anvil-save-handler
  "Constructor.

  p-i-46650-1 - `java.io.File`
  save-directory-name - `java.lang.String`
  p-i-46650-3 - `boolean`
  data-fixer-in - `net.minecraft.util.datafix.DataFixer`"
  (^AnvilSaveHandler [^java.io.File p-i-46650-1 ^java.lang.String save-directory-name ^Boolean p-i-46650-3 ^net.minecraft.util.datafix.DataFixer data-fixer-in]
    (new AnvilSaveHandler p-i-46650-1 save-directory-name p-i-46650-3 data-fixer-in)))

(defn get-chunk-loader
  "provider - `net.minecraft.world.WorldProvider`

  returns: `net.minecraft.world.chunk.storage.IChunkLoader`"
  (^net.minecraft.world.chunk.storage.IChunkLoader [^AnvilSaveHandler this ^net.minecraft.world.WorldProvider provider]
    (-> this (.getChunkLoader provider))))

(defn save-world-info-with-player
  "world-information - `net.minecraft.world.storage.WorldInfo`
  tag-compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^AnvilSaveHandler this ^net.minecraft.world.storage.WorldInfo world-information ^net.minecraft.nbt.NBTTagCompound tag-compound]
    (-> this (.saveWorldInfoWithPlayer world-information tag-compound))))

(defn flush
  ""
  ([^AnvilSaveHandler this]
    (-> this (.flush))))


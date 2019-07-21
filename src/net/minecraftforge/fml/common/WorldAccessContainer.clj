(ns net.minecraftforge.fml.common.WorldAccessContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common WorldAccessContainer]))

(defn get-data-for-writing
  "handler - `net.minecraft.world.storage.SaveHandler`
  info - `net.minecraft.world.storage.WorldInfo`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^WorldAccessContainer this ^net.minecraft.world.storage.SaveHandler handler ^net.minecraft.world.storage.WorldInfo info]
    (-> this (.getDataForWriting handler info))))

(defn read-data
  "handler - `net.minecraft.world.storage.SaveHandler`
  info - `net.minecraft.world.storage.WorldInfo`
  property-map - `java.util.Map`
  tag - `net.minecraft.nbt.NBTTagCompound`"
  ([^WorldAccessContainer this ^net.minecraft.world.storage.SaveHandler handler ^net.minecraft.world.storage.WorldInfo info ^java.util.Map property-map ^net.minecraft.nbt.NBTTagCompound tag]
    (-> this (.readData handler info property-map tag))))


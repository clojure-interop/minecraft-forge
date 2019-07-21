(ns net.minecraft.util.datafix.fixes.BannerItemColor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.datafix.fixes BannerItemColor]))

(defn ->banner-item-color
  "Constructor."
  (^BannerItemColor []
    (new BannerItemColor )))

(defn get-fix-version
  "returns: `int`"
  (^Integer [^BannerItemColor this]
    (-> this (.getFixVersion))))

(defn fix-tag-compound
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^BannerItemColor this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.fixTagCompound compound))))


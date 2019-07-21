(ns net.minecraft.village.VillageCollection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.village VillageCollection]))

(defn ->village-collection
  "Constructor.

  name - `java.lang.String`"
  (^VillageCollection [^java.lang.String name]
    (new VillageCollection name)))

(defn *file-name-for-provider
  "provider - `net.minecraft.world.WorldProvider`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.world.WorldProvider provider]
    (VillageCollection/fileNameForProvider provider)))

(defn set-worlds-for-all
  "world-in - `net.minecraft.world.World`"
  ([^VillageCollection this ^net.minecraft.world.World world-in]
    (-> this (.setWorldsForAll world-in))))

(defn add-to-villager-position-list
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^VillageCollection this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.addToVillagerPositionList pos))))

(defn tick
  ""
  ([^VillageCollection this]
    (-> this (.tick))))

(defn get-village-list
  "returns: `java.util.List<net.minecraft.village.Village>`"
  (^java.util.List [^VillageCollection this]
    (-> this (.getVillageList))))

(defn get-nearest-village
  "door-block - `net.minecraft.util.math.BlockPos`
  radius - `int`

  returns: `net.minecraft.village.Village`"
  (^net.minecraft.village.Village [^VillageCollection this ^net.minecraft.util.math.BlockPos door-block ^Integer radius]
    (-> this (.getNearestVillage door-block radius))))

(defn read-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^VillageCollection this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readFromNBT nbt))))

(defn write-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^VillageCollection this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeToNBT compound))))


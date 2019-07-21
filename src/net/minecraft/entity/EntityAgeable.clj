(ns net.minecraft.entity.EntityAgeable
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityAgeable]))

(defn ->entity-ageable
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityAgeable [^net.minecraft.world.World world-in]
    (new EntityAgeable world-in)))

(defn set-growing-age
  "age - `int`"
  ([^EntityAgeable this ^Integer age]
    (-> this (.setGrowingAge age))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityAgeable this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.EntityAgeable`"
  (^net.minecraft.entity.EntityAgeable [^EntityAgeable this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn set-scale-for-age
  "child - `boolean`"
  ([^EntityAgeable this ^Boolean child]
    (-> this (.setScaleForAge child))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityAgeable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityAgeable this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn child?
  "returns: `boolean`"
  (^Boolean [^EntityAgeable this]
    (-> this (.isChild))))

(defn age-up
  "p-175501-1 - `int`
  p-175501-2 - `boolean`"
  ([^EntityAgeable this ^Integer p-175501-1 ^Boolean p-175501-2]
    (-> this (.ageUp p-175501-1 p-175501-2))))

(defn get-growing-age
  "returns: `int`"
  (^Integer [^EntityAgeable this]
    (-> this (.getGrowingAge))))

(defn add-growth
  "growth - `int`"
  ([^EntityAgeable this ^Integer growth]
    (-> this (.addGrowth growth))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityAgeable this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn on-living-update
  ""
  ([^EntityAgeable this]
    (-> this (.onLivingUpdate))))


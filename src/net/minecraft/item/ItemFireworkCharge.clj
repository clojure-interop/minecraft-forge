(ns net.minecraft.item.ItemFireworkCharge
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemFireworkCharge]))

(defn ->item-firework-charge
  "Constructor."
  (^ItemFireworkCharge []
    (new ItemFireworkCharge )))

(defn *get-explosion-tag
  "stack - `net.minecraft.item.ItemStack`
  key - `java.lang.String`

  returns: `net.minecraft.nbt.NBTBase`"
  (^net.minecraft.nbt.NBTBase [^net.minecraft.item.ItemStack stack ^java.lang.String key]
    (ItemFireworkCharge/getExplosionTag stack key)))

(defn *add-explosion-info
  "nbt - `net.minecraft.nbt.NBTTagCompound`
  tooltip - `java.util.List`"
  ([^net.minecraft.nbt.NBTTagCompound nbt ^java.util.List tooltip]
    (ItemFireworkCharge/addExplosionInfo nbt tooltip)))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemFireworkCharge this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))


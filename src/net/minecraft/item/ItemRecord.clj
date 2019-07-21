(ns net.minecraft.item.ItemRecord
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemRecord]))

(defn *get-by-sound
  "sound-in - `net.minecraft.util.SoundEvent`

  returns: `net.minecraft.item.ItemRecord`"
  (^net.minecraft.item.ItemRecord [^net.minecraft.util.SoundEvent sound-in]
    (ItemRecord/getBySound sound-in)))

(defn on-item-use
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  hand - `net.minecraft.util.EnumHand`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^ItemRecord this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumHand hand ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.onItemUse player world-in pos hand facing hit-x hit-y hit-z))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemRecord this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

(defn get-record-resource
  "Retrieves the resource location of the sound to play for this record.

  name - The name of the record to play - `java.lang.String`

  returns: The resource location for the audio, null to use default. - `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^ItemRecord this ^java.lang.String name]
    (-> this (.getRecordResource name))))

(defn get-record-name-local
  "returns: `java.lang.String`"
  (^java.lang.String [^ItemRecord this]
    (-> this (.getRecordNameLocal))))

(defn get-rarity
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumRarity`"
  (^net.minecraft.item.EnumRarity [^ItemRecord this ^net.minecraft.item.ItemStack stack]
    (-> this (.getRarity stack))))

(defn get-sound
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^ItemRecord this]
    (-> this (.getSound))))


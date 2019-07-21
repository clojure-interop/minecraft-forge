(ns net.minecraft.item.ItemWrittenBook
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemWrittenBook]))

(defn ->item-written-book
  "Constructor."
  (^ItemWrittenBook []
    (new ItemWrittenBook )))

(defn *valid-book-tag-contents
  "nbt - `net.minecraft.nbt.NBTTagCompound`

  returns: `boolean`"
  (^Boolean [^net.minecraft.nbt.NBTTagCompound nbt]
    (ItemWrittenBook/validBookTagContents nbt)))

(defn *get-generation
  "book - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^net.minecraft.item.ItemStack book]
    (ItemWrittenBook/getGeneration book)))

(defn get-item-stack-display-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemWrittenBook this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemStackDisplayName stack))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemWrittenBook this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemWrittenBook this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn has-effect?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemWrittenBook this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasEffect stack))))


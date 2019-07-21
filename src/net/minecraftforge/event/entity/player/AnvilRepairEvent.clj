(ns net.minecraftforge.event.entity.player.AnvilRepairEvent
  "Fired when the player removes a \"repaired\" item from the Anvil's Output slot.

  breakChance specifies as a percentage the chance that the anvil will be \"damaged\" when used.

  ItemStacks are the inputs/output from the anvil. They cannot be edited."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player AnvilRepairEvent]))

(defn ->anvil-repair-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  left - `net.minecraft.item.ItemStack`
  right - `net.minecraft.item.ItemStack`
  output - `net.minecraft.item.ItemStack`"
  (^AnvilRepairEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack left ^net.minecraft.item.ItemStack right ^net.minecraft.item.ItemStack output]
    (new AnvilRepairEvent player left right output)))

(defn get-left
  "Deprecated.

  returns: the output slot - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AnvilRepairEvent this]
    (-> this (.getLeft))))

(defn get-right
  "Deprecated.

  returns: the first input slot - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AnvilRepairEvent this]
    (-> this (.getRight))))

(defn get-output
  "Deprecated.

  returns: the second input slot - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AnvilRepairEvent this]
    (-> this (.getOutput))))

(defn get-item-result
  "Get the output result from the anvil

  returns: the output - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AnvilRepairEvent this]
    (-> this (.getItemResult))))

(defn get-item-input
  "Get the first item input into the anvil

  returns: the first input slot - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AnvilRepairEvent this]
    (-> this (.getItemInput))))

(defn get-ingredient-input
  "Get the second item input into the anvil

  returns: the second input slot - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AnvilRepairEvent this]
    (-> this (.getIngredientInput))))

(defn get-break-chance
  "returns: `float`"
  (^Float [^AnvilRepairEvent this]
    (-> this (.getBreakChance))))

(defn set-break-chance
  "break-chance - `float`"
  ([^AnvilRepairEvent this ^Float break-chance]
    (-> this (.setBreakChance break-chance))))


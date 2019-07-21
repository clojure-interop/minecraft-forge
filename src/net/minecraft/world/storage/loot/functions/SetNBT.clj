(ns net.minecraft.world.storage.loot.functions.SetNBT
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions SetNBT]))

(defn ->set-nbt
  "Constructor.

  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  tag-in - `net.minecraft.nbt.NBTTagCompound`"
  (^SetNBT [conditions-in ^net.minecraft.nbt.NBTTagCompound tag-in]
    (new SetNBT conditions-in tag-in)))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SetNBT this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))


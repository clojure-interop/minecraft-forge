(ns net.minecraftforge.oredict.OreDictionary$OreRegisterEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.oredict OreDictionary$OreRegisterEvent]))

(defn ->ore-register-event
  "Constructor.

  name - `java.lang.String`
  ore - `net.minecraft.item.ItemStack`"
  (^OreDictionary$OreRegisterEvent [^java.lang.String name ^net.minecraft.item.ItemStack ore]
    (new OreDictionary$OreRegisterEvent name ore)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^OreDictionary$OreRegisterEvent this]
    (-> this (.getName))))

(defn get-ore
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^OreDictionary$OreRegisterEvent this]
    (-> this (.getOre))))


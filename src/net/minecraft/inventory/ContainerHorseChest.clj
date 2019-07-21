(ns net.minecraft.inventory.ContainerHorseChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory ContainerHorseChest]))

(defn ->container-horse-chest
  "Constructor.

  inventory-title - `java.lang.String`
  slot-count - `int`"
  (^ContainerHorseChest [^java.lang.String inventory-title ^Integer slot-count]
    (new ContainerHorseChest inventory-title slot-count)))


(ns net.minecraft.world.gen.feature.WorldGeneratorBonusChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGeneratorBonusChest]))

(defn ->world-generator-bonus-chest
  "Constructor."
  (^WorldGeneratorBonusChest []
    (new WorldGeneratorBonusChest )))

(defn generate
  "world-in - `net.minecraft.world.World`
  rand - `java.util.Random`
  position - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^WorldGeneratorBonusChest this ^net.minecraft.world.World world-in ^java.util.Random rand ^net.minecraft.util.math.BlockPos position]
    (-> this (.generate world-in rand position))))


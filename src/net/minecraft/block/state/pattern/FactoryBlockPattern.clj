(ns net.minecraft.block.state.pattern.FactoryBlockPattern
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state.pattern FactoryBlockPattern]))

(defn *start
  "returns: `net.minecraft.block.state.pattern.FactoryBlockPattern`"
  (^net.minecraft.block.state.pattern.FactoryBlockPattern []
    (FactoryBlockPattern/start )))

(defn aisle
  "aisle - `java.lang.String`

  returns: `net.minecraft.block.state.pattern.FactoryBlockPattern`"
  (^net.minecraft.block.state.pattern.FactoryBlockPattern [^FactoryBlockPattern this ^java.lang.String aisle]
    (-> this (.aisle aisle))))

(defn where
  "symbol - `char`
  block-matcher - `com.google.common.base.Predicate`

  returns: `net.minecraft.block.state.pattern.FactoryBlockPattern`"
  (^net.minecraft.block.state.pattern.FactoryBlockPattern [^FactoryBlockPattern this ^Character symbol ^com.google.common.base.Predicate block-matcher]
    (-> this (.where symbol block-matcher))))

(defn build
  "returns: `net.minecraft.block.state.pattern.BlockPattern`"
  (^net.minecraft.block.state.pattern.BlockPattern [^FactoryBlockPattern this]
    (-> this (.build))))


(ns net.minecraft.potion.PotionHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionHelper]))

(defn ->potion-helper
  "Constructor."
  (^PotionHelper []
    (new PotionHelper )))

(defn *reagent?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack stack]
    (PotionHelper/isReagent stack)))

(defn *has-conversions?
  "input - `net.minecraft.item.ItemStack`
  reagent - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack input ^net.minecraft.item.ItemStack reagent]
    (PotionHelper/hasConversions input reagent)))

(defn *do-reaction
  "reagent - `net.minecraft.item.ItemStack`
  potion-in - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^net.minecraft.item.ItemStack reagent ^net.minecraft.item.ItemStack potion-in]
    (PotionHelper/doReaction reagent potion-in)))

(defn *init
  ""
  ([]
    (PotionHelper/init )))

(defn *register-potion-item-conversion
  "p-185201-0 - `net.minecraft.item.ItemPotion`
  p-185201-1 - `net.minecraft.potion.PotionHelper$ItemPredicateInstance`
  p-185201-2 - `net.minecraft.item.ItemPotion`"
  ([^net.minecraft.item.ItemPotion p-185201-0 ^net.minecraft.potion.PotionHelper$ItemPredicateInstance p-185201-1 ^net.minecraft.item.ItemPotion p-185201-2]
    (PotionHelper/registerPotionItemConversion p-185201-0 p-185201-1 p-185201-2)))

(defn *register-potion-item
  "p-185202-0 - `net.minecraft.potion.PotionHelper$ItemPredicateInstance`"
  ([^net.minecraft.potion.PotionHelper$ItemPredicateInstance p-185202-0]
    (PotionHelper/registerPotionItem p-185202-0)))

(defn *register-potion-type-conversion
  "input - `net.minecraft.potion.PotionType`
  reagent-predicate - `com.google.common.base.Predicate`
  output - `net.minecraft.potion.PotionType`"
  ([^net.minecraft.potion.PotionType input ^com.google.common.base.Predicate reagent-predicate ^net.minecraft.potion.PotionType output]
    (PotionHelper/registerPotionTypeConversion input reagent-predicate output)))


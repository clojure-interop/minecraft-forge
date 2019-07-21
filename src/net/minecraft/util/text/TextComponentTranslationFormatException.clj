(ns net.minecraft.util.text.TextComponentTranslationFormatException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text TextComponentTranslationFormatException]))

(defn ->text-component-translation-format-exception
  "Constructor.

  component - `net.minecraft.util.text.TextComponentTranslation`
  message - `java.lang.String`"
  (^TextComponentTranslationFormatException [^net.minecraft.util.text.TextComponentTranslation component ^java.lang.String message]
    (new TextComponentTranslationFormatException component message)))


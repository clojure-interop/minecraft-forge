(ns net.minecraftforge.fml.common.ProxyInjector
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ProxyInjector]))

(defn ->proxy-injector
  "Constructor."
  (^ProxyInjector []
    (new ProxyInjector )))

(defn *inject
  "mod - `net.minecraftforge.fml.common.ModContainer`
  data - `net.minecraftforge.fml.common.discovery.ASMDataTable`
  side - `net.minecraftforge.fml.relauncher.Side`
  language-adapter - `net.minecraftforge.fml.common.ILanguageAdapter`"
  ([^net.minecraftforge.fml.common.ModContainer mod ^net.minecraftforge.fml.common.discovery.ASMDataTable data ^net.minecraftforge.fml.relauncher.Side side ^net.minecraftforge.fml.common.ILanguageAdapter language-adapter]
    (ProxyInjector/inject mod data side language-adapter)))


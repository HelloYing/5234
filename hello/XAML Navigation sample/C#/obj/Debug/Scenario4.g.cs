﻿

#pragma checksum "C:\Users\Zhiying\Downloads\XAML Navigation sample\C#\Scenario4.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "BD23A3E71BAF2A364F3F18E6172162FB"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Navigation
{
    partial class Scenario4 : global::Windows.UI.Xaml.Controls.Page, global::Windows.UI.Xaml.Markup.IComponentConnector
    {
        [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.Windows.UI.Xaml.Build.Tasks"," 4.0.0.0")]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
 
        public void Connect(int connectionId, object target)
        {
            switch(connectionId)
            {
            case 1:
                #line 44 "..\..\Scenario4.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.NavigatePage1BtnClick;
                 #line default
                 #line hidden
                break;
            case 2:
                #line 45 "..\..\Scenario4.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.NavigatePage2BtnClick;
                 #line default
                 #line hidden
                break;
            case 3:
                #line 46 "..\..\Scenario4.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.NavigatePage3BtnClick;
                 #line default
                 #line hidden
                break;
            case 4:
                #line 47 "..\..\Scenario4.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.GoHomeButtonClick;
                 #line default
                 #line hidden
                break;
            case 5:
                #line 48 "..\..\Scenario4.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.GoBackButtonClick;
                 #line default
                 #line hidden
                break;
            case 6:
                #line 49 "..\..\Scenario4.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.GoForwardButtonClick;
                 #line default
                 #line hidden
                break;
            case 7:
                #line 50 "..\..\Scenario4.xaml"
                ((global::Windows.UI.Xaml.Controls.Primitives.ButtonBase)(target)).Click += this.ClearStacksButtonClick;
                 #line default
                 #line hidden
                break;
            }
            this._contentLoaded = true;
        }
    }
}


/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.plugins.template;

import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * @author GedMarc
 * @since 15 Feb 2017
 *
 */
@PluginInformation(pluginName = "Default Component Project Template",
                   pluginUniqueName = "project-template",
                   pluginDescription = "This plugin assists with building new components for bower, jwebswing, and netbeans. It is intended to become a netbeans plugin. Please see the component template and the event template for examples and guides",
                   pluginVersion = "0.1",
                   pluginDependancyUniqueIDs = "",
                   pluginCategories = "jwebswing, building, template, components, projects",
                   pluginSubtitle = "Quickly build new components for your website!",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-ProjectTemplate",
                   pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-ProjectTemplate",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-ProjectTemplate/wiki",
                   pluginOriginalHomepage = "http://www.jwebswing.com",
                   pluginDownloadUrl = "",
                   pluginIconUrl = "",
                   pluginIconImageUrl = "",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class PageConfiguration extends PageConfigurator
{

    private static final long serialVersionUID = 1L;
    private static final Logger log = LogFactory.getInstance().getLogger("BlankConfiguration");
    public static final String BlankEnabled = "blank-enabled";

    public PageConfiguration()
    {

    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            if (page.getBody().readChildrenPropertyFirstResult(BlankEnabled, true))
            {
                //page.getBody().getCssReferences().add(FontAwesomeReferencePool.FontAwesomeReference.getJavaScriptReference());
            }
        }
        return page;
    }

    /**
     * Sets the component as font awesome required to build
     *
     * @param component
     * @param required
     */
    public static void setRequired(Component component, boolean required)
    {
        component.getProperties().put(BlankEnabled, required);
    }
}

package growthcraft.cellar.shared.booze.modifier;

public class ModifierFunctionHyperExtended extends AbstractModifierFunction
{
	// REVISE_ME 0
	
	@Override
	public int applyLevel(int l)
	{
		return l + 1;
	}

	@Override
	public int applyTime(int t)
	{
		return (int)(t * 2.67F);
	}
}

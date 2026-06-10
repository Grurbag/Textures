// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelOgreGladiatorHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmet_2;
	private final ModelRenderer helmet_3;
	private final ModelRenderer helmet_4;

	public WFMModelOgreGladiatorHelmet() {
		textureWidth = 128;
		textureHeight = 128;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 22.0F, 1.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -6.0F, -10.0F, -7.0F, 12, 12, 12, 0.0F, false));

		helmet_2 = new ModelRenderer(this);
		helmet_2.setRotationPoint(0.0F, -4.0F, 0.0F);
		helmet.addChild(helmet_2);
		setRotationAngle(helmet_2, -0.2618F, 0.0F, 0.0F);
		helmet_2.cubeList.add(new ModelBox(helmet_2, 0, 33, -9.0F, -2.0F, -11.0F, 18, 1, 9, 0.0F, false));

		helmet_3 = new ModelRenderer(this);
		helmet_3.setRotationPoint(0.0F, -2.6046F, 1.4862F);
		helmet_2.addChild(helmet_3);
		setRotationAngle(helmet_3, 0.2618F, 0.0F, 0.0F);
		helmet_3.cubeList.add(new ModelBox(helmet_3, 0, 52, -8.9F, -0.5F, -4.5F, 18, 1, 9, 0.0F, false));

		helmet_4 = new ModelRenderer(this);
		helmet_4.setRotationPoint(2.0F, -10.0F, 0.0F);
		helmet.addChild(helmet_4);
		helmet_4.cubeList.add(new ModelBox(helmet_4, 0, 69, -2.5F, -5.0F, -5.0F, 1, 5, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
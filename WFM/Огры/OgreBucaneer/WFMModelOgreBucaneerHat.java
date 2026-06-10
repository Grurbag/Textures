// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelOgreBucaneerHat extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmet2;
	private final ModelRenderer helmet3;
	private final ModelRenderer helmet4;
	private final ModelRenderer helmet5;

	public WFMModelOgreBucaneerHat() {
		textureWidth = 128;
		textureHeight = 128;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 22.0F, 1.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -6.0F, -10.0F, -7.0F, 12, 12, 12, 0.0F, false));

		helmet2 = new ModelRenderer(this);
		helmet2.setRotationPoint(6.0F, -9.0F, -7.0F);
		helmet.addChild(helmet2);
		setRotationAngle(helmet2, 0.0F, -0.9163F, 0.0F);
		helmet2.cubeList.add(new ModelBox(helmet2, 0, 28, -10.5381F, -9.0F, 0.0126F, 27, 10, 0, 0.0F, false));

		helmet3 = new ModelRenderer(this);
		helmet3.setRotationPoint(-8.0F, -9.0F, -5.0F);
		helmet.addChild(helmet3);
		setRotationAngle(helmet3, 0.0F, -2.1817F, 0.0F);
		helmet3.cubeList.add(new ModelBox(helmet3, 0, 39, -12.6852F, -9.0F, -0.3564F, 26, 10, 0, 0.0F, false));

		helmet4 = new ModelRenderer(this);
		helmet4.setRotationPoint(2.0F, -9.0F, 6.0F);
		helmet.addChild(helmet4);
		helmet4.cubeList.add(new ModelBox(helmet4, 0, 56, -17.7321F, -9.0F, 0.0F, 32, 10, 0, 0.0F, false));

		helmet5 = new ModelRenderer(this);
		helmet5.setRotationPoint(0.0F, -6.0F, 0.0F);
		helmet.addChild(helmet5);
		setRotationAngle(helmet5, 0.0F, 0.7854F, 0.0F);
		helmet5.cubeList.add(new ModelBox(helmet5, 52, 0, -14.2929F, -2.0F, -10.7071F, 25, 0, 26, 0.0F, false));
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
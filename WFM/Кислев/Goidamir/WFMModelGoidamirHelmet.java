// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelGoidamirHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer helmet2;
	private final ModelRenderer helmet3;

	public WFMModelGoidamirHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		helmet2 = new ModelRenderer(this);
		helmet2.setRotationPoint(0.0F, -6.0F, -4.0F);
		helmet.addChild(helmet2);
		setRotationAngle(helmet2, 0.0F, 0.0F, 0.7854F);
		helmet2.cubeList.add(new ModelBox(helmet2, 0, 17, -5.0F, -5.0F, -0.5F, 6, 6, 9, 0.5F, false));

		helmet3 = new ModelRenderer(this);
		helmet3.setRotationPoint(1.0F, -13.0F, 0.0F);
		helmet.addChild(helmet3);
		helmet3.cubeList.add(new ModelBox(helmet3, 54, 26, -3.5F, -6.0F, 0.0F, 5, 6, 0, 0.0F, false));
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
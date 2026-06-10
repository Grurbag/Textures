// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelNoscaSlaaneshHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer hornLeft;
	private final ModelRenderer hornRight;
	private final ModelRenderer sigil;
	private final ModelRenderer beard;

	public WFMModelNoscaSlaaneshHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		hornLeft = new ModelRenderer(this);
		hornLeft.setRotationPoint(-5.0F, -4.0F, 0.0F);
		helmetOverlay.addChild(hornLeft);
		hornLeft.cubeList.add(new ModelBox(hornLeft, 0, 25, -11.0F, -7.0F, 0.0F, 12, 7, 0, 0.0F, false));

		hornRight = new ModelRenderer(this);
		hornRight.setRotationPoint(15.0F, -4.0F, 0.0F);
		helmetOverlay.addChild(hornRight);
		hornRight.cubeList.add(new ModelBox(hornRight, 0, 17, -11.0F, -7.0F, 0.0F, 12, 7, 0, 0.0F, false));

		sigil = new ModelRenderer(this);
		sigil.setRotationPoint(0.0F, -8.0F, -2.0F);
		helmetOverlay.addChild(sigil);
		sigil.cubeList.add(new ModelBox(sigil, 42, 20, -5.5F, -12.0F, 0.0F, 11, 12, 0, 0.0F, false));

		beard = new ModelRenderer(this);
		beard.setRotationPoint(0.0F, 8.0F, -4.0F);
		helmetOverlay.addChild(beard);
		beard.cubeList.add(new ModelBox(beard, 24, 16, -4.5F, -8.0F, -0.5F, 9, 8, 0, 0.0F, false));
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